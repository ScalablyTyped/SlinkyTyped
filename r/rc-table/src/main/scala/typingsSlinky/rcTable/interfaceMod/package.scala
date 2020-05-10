package typingsSlinky.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type ColumnsType[RecordType] = js.Array[
    typingsSlinky.rcTable.interfaceMod.ColumnGroupType[RecordType] | typingsSlinky.rcTable.interfaceMod.ColumnType[RecordType]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.react.mod.ComponentType[P]
    - typingsSlinky.react.mod.ForwardRefExoticComponent[P]
    - typingsSlinky.react.mod.FC[P]
    - typingsSlinky.rcTable.rcTableStrings.a
    - typingsSlinky.rcTable.rcTableStrings.abbr
    - typingsSlinky.rcTable.rcTableStrings.address
    - typingsSlinky.rcTable.rcTableStrings.area
    - typingsSlinky.rcTable.rcTableStrings.article
    - typingsSlinky.rcTable.rcTableStrings.aside
    - typingsSlinky.rcTable.rcTableStrings.audio
    - typingsSlinky.rcTable.rcTableStrings.b
    - typingsSlinky.rcTable.rcTableStrings.base
    - typingsSlinky.rcTable.rcTableStrings.bdi
    - typingsSlinky.rcTable.rcTableStrings.bdo
    - typingsSlinky.rcTable.rcTableStrings.big
    - typingsSlinky.rcTable.rcTableStrings.blockquote
    - typingsSlinky.rcTable.rcTableStrings.body
    - typingsSlinky.rcTable.rcTableStrings.br
    - typingsSlinky.rcTable.rcTableStrings.button
    - typingsSlinky.rcTable.rcTableStrings.canvas
    - typingsSlinky.rcTable.rcTableStrings.caption
    - typingsSlinky.rcTable.rcTableStrings.cite
    - typingsSlinky.rcTable.rcTableStrings.code
    - typingsSlinky.rcTable.rcTableStrings.col
    - typingsSlinky.rcTable.rcTableStrings.colgroup
    - typingsSlinky.rcTable.rcTableStrings.data
    - typingsSlinky.rcTable.rcTableStrings.datalist
    - typingsSlinky.rcTable.rcTableStrings.dd
    - typingsSlinky.rcTable.rcTableStrings.del
    - typingsSlinky.rcTable.rcTableStrings.details
    - typingsSlinky.rcTable.rcTableStrings.dfn
    - typingsSlinky.rcTable.rcTableStrings.dialog
    - typingsSlinky.rcTable.rcTableStrings.div
    - typingsSlinky.rcTable.rcTableStrings.dl
    - typingsSlinky.rcTable.rcTableStrings.dt
    - typingsSlinky.rcTable.rcTableStrings.em
    - typingsSlinky.rcTable.rcTableStrings.embed
    - typingsSlinky.rcTable.rcTableStrings.fieldset
    - typingsSlinky.rcTable.rcTableStrings.figcaption
    - typingsSlinky.rcTable.rcTableStrings.figure
    - typingsSlinky.rcTable.rcTableStrings.footer
    - typingsSlinky.rcTable.rcTableStrings.form
    - typingsSlinky.rcTable.rcTableStrings.h1
    - typingsSlinky.rcTable.rcTableStrings.h2
    - typingsSlinky.rcTable.rcTableStrings.h3
    - typingsSlinky.rcTable.rcTableStrings.h4
    - typingsSlinky.rcTable.rcTableStrings.h5
    - typingsSlinky.rcTable.rcTableStrings.h6
    - typingsSlinky.rcTable.rcTableStrings.head
    - typingsSlinky.rcTable.rcTableStrings.header
    - typingsSlinky.rcTable.rcTableStrings.hgroup
    - typingsSlinky.rcTable.rcTableStrings.hr
    - typingsSlinky.rcTable.rcTableStrings.html
    - typingsSlinky.rcTable.rcTableStrings.i
    - typingsSlinky.rcTable.rcTableStrings.iframe
    - typingsSlinky.rcTable.rcTableStrings.img
    - typingsSlinky.rcTable.rcTableStrings.input
    - typingsSlinky.rcTable.rcTableStrings.ins
    - typingsSlinky.rcTable.rcTableStrings.kbd
    - typingsSlinky.rcTable.rcTableStrings.keygen
    - typingsSlinky.rcTable.rcTableStrings.label
    - typingsSlinky.rcTable.rcTableStrings.legend
    - typingsSlinky.rcTable.rcTableStrings.li
    - typingsSlinky.rcTable.rcTableStrings.link
    - typingsSlinky.rcTable.rcTableStrings.main
    - typingsSlinky.rcTable.rcTableStrings.map
    - typingsSlinky.rcTable.rcTableStrings.mark
    - typingsSlinky.rcTable.rcTableStrings.menu
    - typingsSlinky.rcTable.rcTableStrings.menuitem
    - typingsSlinky.rcTable.rcTableStrings.meta
    - typingsSlinky.rcTable.rcTableStrings.meter
    - typingsSlinky.rcTable.rcTableStrings.nav
    - typingsSlinky.rcTable.rcTableStrings.noscript
    - typingsSlinky.rcTable.rcTableStrings.`object`
    - typingsSlinky.rcTable.rcTableStrings.ol
    - typingsSlinky.rcTable.rcTableStrings.optgroup
    - typingsSlinky.rcTable.rcTableStrings.option
    - typingsSlinky.rcTable.rcTableStrings.output
    - typingsSlinky.rcTable.rcTableStrings.p
    - typingsSlinky.rcTable.rcTableStrings.param
    - typingsSlinky.rcTable.rcTableStrings.picture
    - typingsSlinky.rcTable.rcTableStrings.pre
    - typingsSlinky.rcTable.rcTableStrings.progress
    - typingsSlinky.rcTable.rcTableStrings.q
    - typingsSlinky.rcTable.rcTableStrings.rp
    - typingsSlinky.rcTable.rcTableStrings.rt
    - typingsSlinky.rcTable.rcTableStrings.ruby
    - typingsSlinky.rcTable.rcTableStrings.s
    - typingsSlinky.rcTable.rcTableStrings.samp
    - typingsSlinky.rcTable.rcTableStrings.slot
    - typingsSlinky.rcTable.rcTableStrings.script
    - typingsSlinky.rcTable.rcTableStrings.section
    - typingsSlinky.rcTable.rcTableStrings.select
    - typingsSlinky.rcTable.rcTableStrings.small
    - typingsSlinky.rcTable.rcTableStrings.source
    - typingsSlinky.rcTable.rcTableStrings.span
    - typingsSlinky.rcTable.rcTableStrings.strong
    - typingsSlinky.rcTable.rcTableStrings.style
    - typingsSlinky.rcTable.rcTableStrings.sub
    - typingsSlinky.rcTable.rcTableStrings.summary
    - typingsSlinky.rcTable.rcTableStrings.sup
    - typingsSlinky.rcTable.rcTableStrings.table
    - typingsSlinky.rcTable.rcTableStrings.template
    - typingsSlinky.rcTable.rcTableStrings.tbody
    - typingsSlinky.rcTable.rcTableStrings.td
    - typingsSlinky.rcTable.rcTableStrings.textarea
    - typingsSlinky.rcTable.rcTableStrings.tfoot
    - typingsSlinky.rcTable.rcTableStrings.th
    - typingsSlinky.rcTable.rcTableStrings.thead
    - typingsSlinky.rcTable.rcTableStrings.time
    - typingsSlinky.rcTable.rcTableStrings.title
    - typingsSlinky.rcTable.rcTableStrings.tr
    - typingsSlinky.rcTable.rcTableStrings.track
    - typingsSlinky.rcTable.rcTableStrings.u
    - typingsSlinky.rcTable.rcTableStrings.ul
    - typingsSlinky.rcTable.rcTableStrings.`var`
    - typingsSlinky.rcTable.rcTableStrings.video
    - typingsSlinky.rcTable.rcTableStrings.wbr
    - typingsSlinky.rcTable.rcTableStrings.webview
  */
  type Component[P] = typingsSlinky.rcTable.interfaceMod._Component[P] | slinky.core.ReactComponentClass[P] | typingsSlinky.react.mod.ForwardRefExoticComponent[P]
  type CustomizeComponent = typingsSlinky.rcTable.interfaceMod.Component[js.Any]
  type CustomizeScrollBody[RecordType] = js.Function2[
    /* data */ js.Array[RecordType], 
    /* info */ typingsSlinky.rcTable.AnonOnScroll, 
    slinky.core.TagMod[scala.Any]
  ]
  type DataIndex = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
  type DefaultRecordType = typingsSlinky.std.Record[java.lang.String, js.Any]
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    /* expanded */ scala.Boolean, 
    slinky.core.TagMod[scala.Any]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcTable.rcTableStrings.left
    - typingsSlinky.rcTable.rcTableStrings.right
    - scala.Boolean
  */
  type FixedType = typingsSlinky.rcTable.interfaceMod._FixedType | scala.Boolean
  type GetComponent = js.Function2[
    /* path */ js.Array[java.lang.String], 
    /* defaultComponent */ js.UndefOr[typingsSlinky.rcTable.interfaceMod.CustomizeComponent], 
    typingsSlinky.rcTable.interfaceMod.CustomizeComponent
  ]
  type GetComponentProps[DataType] = js.Function2[
    /* data */ DataType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsSlinky.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]
  ]
  type GetRowKey[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsSlinky.rcTable.interfaceMod.Key
  ]
  type Key = typingsSlinky.react.mod.Key
  type PanelRender[RecordType] = js.Function1[/* data */ js.Array[RecordType], slinky.core.TagMod[scala.Any]]
  type RenderExpandIcon[RecordType] = js.Function1[
    /* props */ typingsSlinky.rcTable.interfaceMod.RenderExpandIconProps[RecordType], 
    slinky.core.TagMod[scala.Any]
  ]
  type RowClassName[RecordType] = js.Function3[
    /* record */ RecordType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    java.lang.String
  ]
  type TriggerEventHandler[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
}
