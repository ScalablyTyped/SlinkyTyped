package typingsSlinky.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceMod {
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.HTMLElement
  import slinky.core.ReactComponentClass
  import slinky.core.SyntheticEvent
  import slinky.core.TagMod
  import slinky.core.facade.ReactElement
  import slinky.web.SyntheticMouseEvent
  import typingsSlinky.rcDashTable.Anon_Expandable
  import typingsSlinky.react.reactMod.HTMLAttributes
  import typingsSlinky.std.Record

  type CustomizeComponent[P /* <: HTMLAttributes[HTMLElement] */] = ReactComponentClass[P] | ReactComponentClass[P] | String
  type DefaultValueType = Record[String, js.Any]
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ Double, 
    /* indent */ Double, 
    /* expanded */ Boolean, 
    TagMod[Any]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.rcDashTable.rcDashTableStrings.left
    - typings.rcDashTable.rcDashTableStrings.right
    - scala.Boolean
  */
  type FixedType = _FixedType | Boolean
  type GetComponentProps[DataType] = js.Function2[/* data */ DataType, /* index */ js.UndefOr[Double], HTMLAttributes[HTMLElement]]
  type GetRowKey[ValueType] = js.Function2[/* value */ ValueType, /* index */ Double, Key]
  type IconExpandEventHandler[ValueType] = js.Function2[/* record */ ValueType, /* event */ SyntheticMouseEvent[HTMLElement], Unit]
  type Key = typingsSlinky.react.reactMod.Key
  type LegacyFunction[ValueType] = js.Function3[
    /* record */ ValueType, 
    /* index */ Double, 
    /* event */ SyntheticEvent[Event, Element], 
    Unit
  ]
  type RenderExpandIcon[ValueType] = js.Function1[/* props */ Anon_Expandable[ValueType], TagMod[Any]]
  type RenderNode = js.Function0[TagMod[Any]]
  type RenderRows[ValueType] = js.Function3[
    /* renderData */ js.Array[ValueType], 
    /* indent */ Double, 
    /* ancestorKeys */ js.UndefOr[js.Array[Key]], 
    js.Array[ReactElement]
  ]
  type RowHoverEventHandler = js.Function2[/* isHover */ Boolean, /* key */ Key, Unit]
}
