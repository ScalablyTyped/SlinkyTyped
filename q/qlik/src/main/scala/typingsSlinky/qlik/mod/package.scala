package typingsSlinky.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Global = js.Any
  type NxCellRows = js.Array[typingsSlinky.qlik.mod.NxCell]
  type NxMeasureInfo = typingsSlinky.qlik.mod.ColumnInfo
  type Paint = js.ThisFunction10[
    /* this */ typingsSlinky.qlik.mod.ExtensionContext, 
    /* $element */ js.UndefOr[typingsSlinky.jquery.JQuery[org.scalajs.dom.raw.HTMLElement]], 
    /* layout */ js.UndefOr[typingsSlinky.qlik.mod.Layout], 
    /* qDimensionInfo */ js.UndefOr[typingsSlinky.qlik.mod.NxDimensionInfo], 
    /* qMeasureInfo */ js.UndefOr[typingsSlinky.qlik.mod.NxDimensionInfo], 
    /* qMatrix */ js.UndefOr[js.Array[typingsSlinky.qlik.mod.NxCellRows]], 
    /* dimensions */ js.UndefOr[js.Array[typingsSlinky.qlik.mod.NxCell]], 
    /* measures */ js.UndefOr[js.Array[typingsSlinky.qlik.mod.NxCell]], 
    /* qSize */ js.UndefOr[typingsSlinky.qlik.mod.Size], 
    /* qId */ js.UndefOr[java.lang.String], 
    /* qSelectionInfo */ js.UndefOr[typingsSlinky.qlik.mod.Selectionobject], 
    scala.Unit
  ]
  type ShowFunction = js.Function3[
    /* layout */ typingsSlinky.qlik.mod.Layout, 
    /* cls */ js.Any, 
    /* obj */ js.Any, 
    scala.Boolean | (js.Function1[/* measure */ typingsSlinky.qlik.mod.NxMeasure, scala.Boolean])
  ]
  type SupportFunction = js.Function1[/* layout */ typingsSlinky.qlik.mod.Layout, scala.Boolean]
  type VisualizationOptions = typingsSlinky.qlik.mod.VisualizationCommon
}
