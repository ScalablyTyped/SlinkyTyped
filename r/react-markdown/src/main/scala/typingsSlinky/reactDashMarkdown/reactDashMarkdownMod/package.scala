package typingsSlinky.reactDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMarkdownMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import slinky.core.facade.ReactElement

  /* Rewritten from type alias, can be one of: 
    - typings.reactDashMarkdown.reactDashMarkdownStrings.left
    - typings.reactDashMarkdown.reactDashMarkdownStrings.right
    - typings.reactDashMarkdown.reactDashMarkdownStrings.center
    - scala.Null
  */
  type AlignType = _AlignType | Null
  type LinkTargetResolver = js.Function3[/* uri */ String, /* text */ String, /* title */ js.UndefOr[String], String]
  type MdastPlugin = js.Function2[
    /* node */ MarkdownAbstractSyntaxTree, 
    /* renderProps */ js.UndefOr[RenderProps], 
    MarkdownAbstractSyntaxTree
  ]
  type ReactMarkdown = ReactComponentClass[ReactMarkdownProps]
  type Renderer[T] = js.Function1[/* props */ T, ReactElement]
  type Renderers = StringDictionary[String | Renderer[js.Any]]
}
