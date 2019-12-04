package typingsSlinky.atAngularCommon

import typingsSlinky.atAngularCommon.httpHttpMod.HttpEvent
import typingsSlinky.atAngularCommon.httpMod.HttpRequest
import typingsSlinky.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing", JSImport.Namespace)
@js.native
object httpTestingMod extends js.Object {
  @js.native
  class HttpClientTestingModule ()
    extends typingsSlinky.atAngularCommon.httpTestingTestingMod.HttpClientTestingModule
  
  @js.native
  abstract class HttpTestingController ()
    extends typingsSlinky.atAngularCommon.httpTestingTestingMod.HttpTestingController
  
  @js.native
  class TestRequest protected ()
    extends typingsSlinky.atAngularCommon.httpTestingTestingMod.TestRequest {
    def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  }
  
  @js.native
  class ɵangular_packages_common_http_testing_testing_a ()
    extends typingsSlinky.atAngularCommon.httpTestingTestingMod.ɵangular_packages_common_http_testing_testing_a
  
}

