package typingsSlinky.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment_
  extends Base[String, js.UndefOr[Container[String, Node]]] {
  
  @JSName("type")
  var type_Comment_ : typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment = js.native
}
object Comment_ {
  
  @scala.inline
  def apply(
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone_ : StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    next: () => Node,
    prev: () => Node,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    `type`: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment,
    value: String
  ): Comment_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment_]
  }
  
  @scala.inline
  implicit class Comment_MutableBuilder[Self <: Comment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
