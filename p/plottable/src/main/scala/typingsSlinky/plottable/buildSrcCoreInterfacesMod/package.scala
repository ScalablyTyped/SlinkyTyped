package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcCoreInterfacesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.d3DashSelection.d3DashSelectionMod.BaseType
  import typingsSlinky.d3DashSelection.d3DashSelectionMod.Selection
  import typingsSlinky.plottable.buildSrcCoreDatasetMod.Dataset

  type AppliedProjector = js.Function2[/* datum */ js.Any, /* index */ Double, js.Any]
  type AttributeToAppliedProjector = StringDictionary[AppliedProjector]
  type AttributeToProjector = StringDictionary[Projector]
  type IAccessor[T] = js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, T]
  type IRangeProjector[T] = js.Function4[/* value */ T, /* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, T]
  type Projector = js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, js.Any]
  type SimpleSelection[Datum] = Selection[BaseType, Datum | js.Object, js.Any, js.Any]
}
