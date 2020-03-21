package typingsSlinky.antd.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.antd.statisticStatisticMod.StatisticProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Could't extract props from TypeRef(QualifiedName(IArray(Name(slinky), Name(core), Name(ReactComponentClass))),IArray(TypeRef(QualifiedName(IArray(Name(typingsSlinky), Name(antd), Name(statisticStatisticMod), Name(StatisticProps))),IArray(),NoComments)),NoComments) because couldn't resolve ClassTree. */
object Statistic
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd/lib/statistic", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ReactComponentClass[StatisticProps]
}

