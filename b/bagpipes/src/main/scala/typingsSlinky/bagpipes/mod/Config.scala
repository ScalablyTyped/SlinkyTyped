package typingsSlinky.bagpipes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config
  extends /* prop */ StringDictionary[js.Any] {
  var connectMiddlewareDirs: js.UndefOr[js.Array[String]] = js.native
  var userFittingsDirs: js.UndefOr[js.Array[String]] = js.native
  var userViewsDirs: js.UndefOr[js.Array[String]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectMiddlewareDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectMiddlewareDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectMiddlewareDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectMiddlewareDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserFittingsDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFittingsDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFittingsDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFittingsDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserViewsDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userViewsDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserViewsDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userViewsDirs")(js.undefined)
        ret
    }
  }
  
}

