package typingsSlinky.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace[Value /* <: js.UndefOr[String] */]
  extends Base[Value, js.UndefOr[Container[String, Node]]] {
  
  /**
    *  namespace prefix.
    */
  var namespace: String | `true` = js.native
  
  /**
    * A string representing the namespace suitable for output.
    */
  val namespaceString: String = js.native
  
  /** alias for namespace */
  var ns: String | `true` = js.native
  
  /**
    * If a namespace exists, prefix the value provided with it, separated by |.
    */
  def qualifiedName(value: String): String = js.native
}
object Namespace {
  
  @scala.inline
  def apply[Value /* <: js.UndefOr[String] */](
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone_ : StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    namespace: String | `true`,
    namespaceString: String,
    next: () => Node,
    ns: String | `true`,
    prev: () => Node,
    qualifiedName: String => String,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    `type`: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.tag | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.string | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.selector | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.root | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.nesting | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.id | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.universal,
    value: Value
  ): Namespace[Value] = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), isAtPosition = js.Any.fromFunction2(isAtPosition), namespace = namespace.asInstanceOf[js.Any], namespaceString = namespaceString.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), ns = ns.asInstanceOf[js.Any], prev = js.Any.fromFunction0(prev), qualifiedName = js.Any.fromFunction1(qualifiedName), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace[Value]]
  }
  
  @scala.inline
  implicit class NamespaceMutableBuilder[Self <: Namespace[_], Value /* <: js.UndefOr[String] */] (val x: Self with Namespace[Value]) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String | `true`): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceString(value: String): Self = StObject.set(x, "namespaceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: String | `true`): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiedName(value: String => String): Self = StObject.set(x, "qualifiedName", js.Any.fromFunction1(value))
  }
}
