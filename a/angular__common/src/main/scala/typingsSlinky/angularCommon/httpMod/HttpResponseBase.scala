package typingsSlinky.angularCommon.httpMod

import typingsSlinky.angularCommon.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http", "HttpResponseBase")
@js.native
abstract class HttpResponseBase protected ()
  extends typingsSlinky.angularCommon.httpHttpMod.HttpResponseBase {
  /**
    * Super-constructor for all responses.
    *
    * The single parameter accepted is an initialization hash. Any properties
    * of the response passed there will override the default values.
    */
  def this(init: Headers) = this()
  def this(init: Headers, defaultStatus: Double) = this()
  def this(init: Headers, defaultStatus: js.UndefOr[scala.Nothing], defaultStatusText: String) = this()
  def this(init: Headers, defaultStatus: Double, defaultStatusText: String) = this()
}

