package typingsSlinky.reactMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AlignType = typingsSlinky.mdast.mod.AlignType
  
  type LinkTargetResolver = js.Function3[
    /* uri */ java.lang.String, 
    /* text */ java.lang.String, 
    /* title */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  
  type MutuallyExclusive[T, U] = (T with typingsSlinky.reactMarkdown.mod.Not[U]) | (U with typingsSlinky.reactMarkdown.mod.Not[T])
  
  type Not[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? never}
    */ typingsSlinky.reactMarkdown.reactMarkdownStrings.Not with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Point = typingsSlinky.unist.mod.Point
  
  type Position = typingsSlinky.unist.mod.Position
  
  type ReactMarkdownProps = typingsSlinky.reactMarkdown.mod.ReactMarkdownPropsBase with (typingsSlinky.reactMarkdown.mod.MutuallyExclusive[
    typingsSlinky.reactMarkdown.mod.ChildrenProp, 
    typingsSlinky.reactMarkdown.mod.SourceProp
  ]) with (typingsSlinky.reactMarkdown.mod.MutuallyExclusive[
    typingsSlinky.reactMarkdown.mod.AllowedTypesProp, 
    typingsSlinky.reactMarkdown.mod.DisallowedTypesProp
  ]) with (typingsSlinky.reactMarkdown.mod.MutuallyExclusive[
    typingsSlinky.reactMarkdown.mod.EscapeHtmlProp, 
    typingsSlinky.reactMarkdown.mod.MutuallyExclusive[
      typingsSlinky.reactMarkdown.mod.SkipHtmlProp, 
      typingsSlinky.reactMarkdown.mod.AllowDangerousHtmlProp
    ]
  ])
  
  type ReferenceType = typingsSlinky.mdast.mod.ReferenceType
  
  type Renderer[T] = js.Function1[/* props */ T, slinky.core.facade.ReactElement]
  
  type Renderers_ = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.reactMarkdown.mod.Renderer[js.Any]]
}
