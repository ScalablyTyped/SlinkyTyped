package typingsSlinky.reactMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.left
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.right
    - typingsSlinky.reactMarkdown.reactMarkdownStrings.center
    - scala.Null
  */
  type AlignType = typingsSlinky.reactMarkdown.mod._AlignType | scala.Null
  type LinkTargetResolver = js.Function3[
    /* uri */ java.lang.String, 
    /* text */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MdastPlugin = js.Function2[
    /* node */ typingsSlinky.reactMarkdown.mod.MarkdownAbstractSyntaxTree, 
    /* renderProps */ js.UndefOr[typingsSlinky.reactMarkdown.mod.RenderProps], 
    typingsSlinky.reactMarkdown.mod.MarkdownAbstractSyntaxTree
  ]
  type ReactMarkdown = slinky.core.ReactComponentClass[typingsSlinky.reactMarkdown.mod.ReactMarkdownProps]
  type Renderer[T] = js.Function1[/* props */ T, slinky.core.facade.ReactElement]
  type Renderers_ = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.reactMarkdown.mod.Renderer[js.Any]]
}
