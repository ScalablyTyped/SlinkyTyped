package typingsSlinky.antDesignIconsReact

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignIconsReact.antDesignIconsReactBooleans.`false`
import typingsSlinky.antDesignIconsReact.antDesignIconsReactStrings.fill
import typingsSlinky.antDesignIconsReact.antDesignIconsReactStrings.outline
import typingsSlinky.antDesignIconsReact.antDesignIconsReactStrings.twotone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/icons-react/es/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def generate(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String
  ): js.Any = js.native
  def generate(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String,
    rootProps: StringDictionary[js.Any]
  ): js.Any = js.native
  @JSName("generate")
  def generate_false(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractNode */ js.Any,
    key: String,
    rootProps: `false`
  ): js.Any = js.native
  
  def getSecondaryColor(primaryColor: String): String = js.native
  
  def isIconDefinition(target: js.Any): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition * / any */ Boolean = js.native
  
  def log(message: String): Unit = js.native
  
  def normalizeAttrs(): Attrs = js.native
  def normalizeAttrs(attrs: Attrs): Attrs = js.native
  
  @JSName("withSuffix")
  def withSuffix_fill(name: String, theme: fill): String = js.native
  @JSName("withSuffix")
  def withSuffix_outline(name: String, theme: outline): String = js.native
  @JSName("withSuffix")
  def withSuffix_twotone(name: String, theme: twotone): String = js.native
  
  @js.native
  class MiniMap[V] () extends js.Object {
    
    def clear(): Unit = js.native
    
    var collection: js.Any = js.native
    
    def delete(key: String): Boolean = js.native
    
    def get(key: String): js.UndefOr[V] = js.native
    
    def has(key: String): Boolean = js.native
    
    def set(key: String, value: V): this.type = js.native
    
    val size: Double = js.native
  }
  
  type Attrs = StringDictionary[String]
}
