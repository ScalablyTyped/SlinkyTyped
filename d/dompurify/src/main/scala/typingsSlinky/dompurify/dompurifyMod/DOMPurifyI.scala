package typingsSlinky.dompurify.dompurifyMod

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dompurify.Anon_False
import typingsSlinky.dompurify.Anon_RETURNDOM
import typingsSlinky.dompurify.Anon_RETURNDOMFRAGMENT
import typingsSlinky.dompurify.Anon_RETURNTRUSTEDTYPE
import typingsSlinky.dompurify.dompurifyStrings.uponSanitizeAttribute
import typingsSlinky.dompurify.dompurifyStrings.uponSanitizeElement
import typingsSlinky.std.Node
import typingsSlinky.trustedDashTypes.trustedDashTypesMod._Global_.TrustedHTML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPurifyI extends js.Object {
  var isSupported: Boolean = js.native
  var removed: js.Array[_] = js.native
  var version: String = js.native
  def addHook(
    hook: HookName,
    cb: js.Function3[/* currentNode */ Element, /* data */ HookEvent, /* config */ Config, Unit]
  ): Unit = js.native
  @JSName("addHook")
  def addHook_uponSanitizeAttribute(
    hook: uponSanitizeAttribute,
    cb: js.Function3[
      /* currentNode */ Element, 
      /* data */ SanitizeAttributeHookEvent, 
      /* config */ Config, 
      Unit
    ]
  ): Unit = js.native
  @JSName("addHook")
  def addHook_uponSanitizeElement(
    hook: uponSanitizeElement,
    cb: js.Function3[
      /* currentNode */ Element, 
      /* data */ SanitizeElementHookEvent, 
      /* config */ Config, 
      Unit
    ]
  ): Unit = js.native
  def clearConfig(): Unit = js.native
  def isValidAttribute(tag: String, attr: String, value: String): Boolean = js.native
  def removeAllHooks(): Unit = js.native
  def removeHook(entryPoint: HookName): Unit = js.native
  def removeHooks(entryPoint: HookName): Unit = js.native
  def sanitize(source: String): String = js.native
  def sanitize(source: String, config: Config with Anon_RETURNTRUSTEDTYPE): TrustedHTML = js.native
  def sanitize(source: Node): String = js.native
  def sanitize(source: Node, config: Config with Anon_RETURNTRUSTEDTYPE): TrustedHTML = js.native
  @JSName("sanitize")
  def sanitize_DocumentFragment(source: String, config: Config with Anon_RETURNDOMFRAGMENT): DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_DocumentFragment(source: Node, config: Config with Anon_RETURNDOMFRAGMENT): DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_HTMLElement(source: String, config: Config with Anon_RETURNDOM): HTMLElement = js.native
  @JSName("sanitize")
  def sanitize_HTMLElement(source: Node, config: Config with Anon_RETURNDOM): HTMLElement = js.native
  @JSName("sanitize")
  def sanitize_String(source: String, config: Config with Anon_False): String = js.native
  @JSName("sanitize")
  def sanitize_String(source: Node, config: Config with Anon_False): String = js.native
  @JSName("sanitize")
  def sanitize_Union(source: String, config: Config): String | HTMLElement | DocumentFragment = js.native
  @JSName("sanitize")
  def sanitize_Union(source: Node, config: Config): String | HTMLElement | DocumentFragment = js.native
  def setConfig(cfg: Config): Unit = js.native
}

