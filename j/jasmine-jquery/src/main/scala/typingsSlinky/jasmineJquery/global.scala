package typingsSlinky.jasmineJquery

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jasmineJquery.jasmine.Fixtures
import typingsSlinky.jasmineJquery.jasmine.JQueryEventSpy
import typingsSlinky.jasmineJquery.jasmine.JSONFixtures
import typingsSlinky.jasmineJquery.jasmine.JasmineJQuery
import typingsSlinky.jasmineJquery.jasmine.StyleFixtures
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def appendLoadFixtures(uls: String*): Unit = js.native
  
  def appendLoadStyleFixtures(uls: String*): Unit = js.native
  
  def appendSetFixtures(html: String): Unit = js.native
  
  def appendSetStyleFixtures(html: String): Unit = js.native
  
  def getJSONFixture(url: String): js.Any = js.native
  
  def loadFixtures(uls: String*): Unit = js.native
  
  def loadJSONFixtures(uls: String*): JSONFixtures = js.native
  
  def loadStyleFixtures(uls: String*): Unit = js.native
  
  def preloadFixtures(uls: String*): Unit = js.native
  
  def preloadStyleFixtures(uls: String*): Unit = js.native
  
  def readFixtures(uls: String*): String = js.native
  
  def sandbox(): String = js.native
  def sandbox(attributes: js.Any): String = js.native
  
  def setFixtures(html: String): String = js.native
  
  def setStyleFixtures(html: String): Unit = js.native
  
  def spyOnEvent(selector: String, eventName: String): JQueryEventSpy = js.native
  
  @js.native
  object jasmine extends js.Object {
    
    var JQuery: JasmineJQuery = js.native
    
    def getFixtures(): Fixtures = js.native
    
    def getJSONFixtures(): JSONFixtures = js.native
    
    def getStyleFixtures(): StyleFixtures = js.native
    
    def spiedEventsKey(selector: JQuery[HTMLElement], eventName: String): String = js.native
  }
}
