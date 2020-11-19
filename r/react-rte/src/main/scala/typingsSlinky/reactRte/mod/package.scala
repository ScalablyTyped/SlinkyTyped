package typingsSlinky.reactRte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockRenderer = js.Function1[/* block */ typingsSlinky.draftJs.mod.ContentBlock, java.lang.String]
  
  type BlockStyleFn = js.Function1[
    /* block */ typingsSlinky.draftJs.mod.ContentBlock, 
    typingsSlinky.reactRte.mod.RenderConfig
  ]
  
  type ChangeHandler = js.Function1[/* value */ typingsSlinky.reactRte.mod.EditorValue, js.Any]
  
  type CustControlFunc = js.Function3[
    /* set */ typingsSlinky.reactRte.mod.SetControlState, 
    /* get */ typingsSlinky.reactRte.mod.GetControlState, 
    /* state */ typingsSlinky.draftJs.mod.EditorState, 
    slinky.core.facade.ReactElement
  ]
  
  type CustomBlockFn = js.Function1[
    /* element */ org.scalajs.dom.raw.Element, 
    js.UndefOr[scala.Null | typingsSlinky.reactRte.mod.CustomBlockObject]
  ]
  
  type CustomControl = slinky.core.facade.ReactElement | typingsSlinky.reactRte.mod.CustControlFunc
  
  type CustomInlineFn = js.Function2[
    /* element */ org.scalajs.dom.raw.Element, 
    /* inlineCreators */ typingsSlinky.reactRte.mod.InlineCreators, 
    js.UndefOr[
      scala.Null | typingsSlinky.reactRte.mod.Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    typingsSlinky.reactRte.mod.RenderConfig
  ]
  
  type GetControlState = js.Function1[/* key */ java.lang.String, js.UndefOr[java.lang.String]]
  
  type RichTextEditor = slinky.core.ReactComponentClass[typingsSlinky.reactRte.mod.Props]
  
  type SetControlState = js.Function2[/* key */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type StyleConfigList = js.Array[typingsSlinky.reactRte.mod.StyleConfig]
}
