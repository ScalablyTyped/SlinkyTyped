package typingsSlinky.apolloServerErrors.mod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOptions extends js.Object {
  var code: js.UndefOr[String] = js.native
  var errorClass: js.UndefOr[
    Instantiable3[
      /* message */ String, 
      js.UndefOr[/* code */ String], 
      js.UndefOr[/* extensions */ Record[String, js.Any]], 
      ApolloError
    ]
  ] = js.native
}

object ErrorOptions {
  @scala.inline
  def apply(): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOptions]
  }
  @scala.inline
  implicit class ErrorOptionsOps[Self <: ErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorClass(
      value: Instantiable3[
          /* message */ String, 
          js.UndefOr[/* code */ String], 
          js.UndefOr[/* extensions */ Record[String, js.Any]], 
          ApolloError
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorClass")(js.undefined)
        ret
    }
  }
  
}

