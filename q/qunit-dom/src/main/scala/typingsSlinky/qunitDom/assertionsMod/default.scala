package typingsSlinky.qunitDom.assertionsMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import typingsSlinky.qunitDom.mod.global.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qunit-dom/dist/assertions", JSImport.Default)
@js.native
class default protected () extends DOMAssertions {
  def this(target: String, rootElement: Document, testContext: Assert) = this()
  def this(target: String, rootElement: Element, testContext: Assert) = this()
  def this(target: Null, rootElement: Document, testContext: Assert) = this()
  def this(target: Null, rootElement: Element, testContext: Assert) = this()
  def this(target: Element, rootElement: Document, testContext: Assert) = this()
  def this(target: Element, rootElement: Element, testContext: Assert) = this()
}
