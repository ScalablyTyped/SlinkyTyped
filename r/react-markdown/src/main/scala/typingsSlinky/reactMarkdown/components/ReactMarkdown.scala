package typingsSlinky.reactMarkdown.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMarkdown.mod.ReactMarkdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactMarkdown.mod.ReactMarkdownProps because: IArray(Couldn't find props for typingsSlinky.reactMarkdown.mod.ChildrenProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.reactMarkdown.mod.SourceProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)), IArray(Couldn't find props for typingsSlinky.reactMarkdown.mod.AllowedTypesProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.reactMarkdown.mod.DisallowedTypesProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)), IArray(Couldn't find props for typingsSlinky.reactMarkdown.mod.EscapeHtmlProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for ((typingsSlinky.reactMarkdown.mod.SkipHtmlProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any) | (typingsSlinky.reactMarkdown.mod.AllowDangerousHtmlProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any)) with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Couldn't find props for typingsSlinky.reactMarkdown.mod.SkipHtmlProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.), Couldn't find props for typingsSlinky.reactMarkdown.mod.AllowDangerousHtmlProp with typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with js.Any because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)), IArray(Could't extract props from js.Any because couldn't resolve ClassTree.)) */
object ReactMarkdown {
  
  @JSImport("react-markdown", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  def apply(p: ReactMarkdownProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactMarkdown.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
