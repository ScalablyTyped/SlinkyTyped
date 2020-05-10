package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnexMappers extends js.Object {
  def postProcessResponse(response: js.Any): js.Any = js.native
  def wrapIdentifier(identifier: String, origWrap: js.Function1[/* identifier */ String, String]): String = js.native
}

object KnexMappers {
  @scala.inline
  def apply(
    postProcessResponse: js.Any => js.Any,
    wrapIdentifier: (String, js.Function1[/* identifier */ String, String]) => String
  ): KnexMappers = {
    val __obj = js.Dynamic.literal(postProcessResponse = js.Any.fromFunction1(postProcessResponse), wrapIdentifier = js.Any.fromFunction2(wrapIdentifier))
    __obj.asInstanceOf[KnexMappers]
  }
  @scala.inline
  implicit class KnexMappersOps[Self <: KnexMappers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostProcessResponse(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrapIdentifier(value: (String, js.Function1[/* identifier */ String, String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapIdentifier")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

