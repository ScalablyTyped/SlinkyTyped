package typingsSlinky.eggMock.mod

import typingsSlinky.egg.mod.Application
import typingsSlinky.egg.mod.Context
import typingsSlinky.eggMock.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockApplication extends Application {
  
  /**
    * mock Context
    */
  def mockContext(): Context = js.native
  def mockContext(data: js.Any): Context = js.native
  
  def mockCookies(cookies: js.Any): MockApplication = js.native
  
  def mockHeaders(headers: js.Any): MockApplication = js.native
  
  def mockHttpclient(mockUrl: String, mockMethod: String, mockResult: Data): MockApplication = js.native
  def mockHttpclient(mockUrl: String, mockMethod: js.Array[String], mockResult: Data): MockApplication = js.native
  
  /**
    * Mock service
    */
  def mockService(service: String, methodName: String, fn: js.Any): MockApplication = js.native
  
  /**
    * mock service that return error
    */
  def mockServiceError(service: String, methodName: String): MockApplication = js.native
  def mockServiceError(service: String, methodName: String, err: js.Error): MockApplication = js.native
  
  /**
    * mock cookie session
    */
  def mockSession(data: js.Any): MockApplication = js.native
}
