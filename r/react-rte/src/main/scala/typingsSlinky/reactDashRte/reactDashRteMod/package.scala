package typingsSlinky.reactDashRte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRteMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.Element
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod
  import typingsSlinky.draftDashJs.draftDashJsMod.ContentBlock
  import typingsSlinky.draftDashJs.draftDashJsMod.EditorState

  type BlockRenderer = js.Function1[/* block */ ContentBlock, String]
  type BlockStyleFn = js.Function1[/* block */ ContentBlock, RenderConfig]
  type ChangeHandler = js.Function1[/* value */ EditorValue, js.Any]
  type CustControlFunc = js.Function3[
    /* set */ SetControlState, 
    /* get */ GetControlState, 
    /* state */ EditorState, 
    TagMod[Any]
  ]
  type CustomBlockFn = js.Function1[/* element */ Element, js.UndefOr[Null | CustomBlockObject]]
  type CustomControl = TagMod[Any] | CustControlFunc
  type CustomInlineFn = js.Function2[
    /* element */ Element, 
    /* inlineCreators */ InlineCreators, 
    js.UndefOr[
      Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    RenderConfig
  ]
  type GetControlState = js.Function1[/* key */ String, js.UndefOr[String]]
  type RichTextEditor = ReactComponentClass[Props]
  type SetControlState = js.Function2[/* key */ String, /* value */ String, Unit]
  type StringMap = StringDictionary[String]
  type StyleConfigList = js.Array[StyleConfig]
}
