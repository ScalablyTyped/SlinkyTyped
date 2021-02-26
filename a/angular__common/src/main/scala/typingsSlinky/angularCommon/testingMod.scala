package typingsSlinky.angularCommon

import typingsSlinky.angularCommon.httpHttpMod.HttpEvent
import typingsSlinky.angularCommon.httpMod.HttpRequest
import typingsSlinky.rxjs.typesMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/common/http/testing", "HttpClientTestingModule")
  @js.native
  class HttpClientTestingModule ()
    extends typingsSlinky.angularCommon.testingTestingMod.HttpClientTestingModule
  
  @JSImport("@angular/common/http/testing", "HttpTestingController")
  @js.native
  abstract class HttpTestingController ()
    extends typingsSlinky.angularCommon.testingTestingMod.HttpTestingController
  
  @JSImport("@angular/common/http/testing", "TestRequest")
  @js.native
  class TestRequest protected ()
    extends typingsSlinky.angularCommon.testingTestingMod.TestRequest {
    def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  }
  
  @JSImport("@angular/common/http/testing", "\u0275angular_packages_common_http_testing_testing_a")
  @js.native
  class ɵangularPackagesCommonHttpTestingTestingA ()
    extends typingsSlinky.angularCommon.testingTestingMod.ɵangularPackagesCommonHttpTestingTestingA
}
