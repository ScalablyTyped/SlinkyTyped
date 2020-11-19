package typingsSlinky.antvG2.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antvG2.anon.AutoSetAxis
import typingsSlinky.antvG2.anon.Bottom
import typingsSlinky.antvG2.anon.Padding
import typingsSlinky.antvG2.anon.PartialChartProps
import typingsSlinky.antvG2.anon.X
import typingsSlinky.antvG2.antvG2Strings.animate
import typingsSlinky.antvG2.antvG2Strings.background
import typingsSlinky.antvG2.antvG2Strings.container
import typingsSlinky.antvG2.antvG2Strings.data
import typingsSlinky.antvG2.antvG2Strings.forceFit
import typingsSlinky.antvG2.antvG2Strings.height
import typingsSlinky.antvG2.antvG2Strings.list
import typingsSlinky.antvG2.antvG2Strings.matrix
import typingsSlinky.antvG2.antvG2Strings.mirror
import typingsSlinky.antvG2.antvG2Strings.padding
import typingsSlinky.antvG2.antvG2Strings.pixelRatio
import typingsSlinky.antvG2.antvG2Strings.plotBackground
import typingsSlinky.antvG2.antvG2Strings.rect
import typingsSlinky.antvG2.antvG2Strings.theme
import typingsSlinky.antvG2.antvG2Strings.tree
import typingsSlinky.antvG2.antvG2Strings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2", "Chart")
@js.native
class Chart protected () extends BashView {
  def this(config: PartialChartProps) = this()
  
  def changeHeight(height: Double): this.type = js.native
  
  def changeSize(width: Double, height: Double): this.type = js.native
  
  def changeWidth(width: Double): this.type = js.native
  
  def downloadImage(name: String): String = js.native
  
  @JSName("facet")
  def facet_list(`type`: list, option: AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_matrix(`type`: matrix, option: AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_mirror(`type`: mirror, option: AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_rect(`type`: rect, option: AutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_tree(`type`: tree, option: AutoSetAxis): Unit = js.native
  
  def forceFit(): this.type = js.native
  
  def getAllGeoms(): js.Array[Geom] = js.native
  
  def getSnapRecords(ponit: X): js.Array[Double] = js.native
  
  @JSName("get")
  def get_animate(prop: animate): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_background(prop: background): js.UndefOr[typingsSlinky.antvG2.mod.Styles.background] = js.native
  @JSName("get")
  def get_container(prop: container): String | HTMLDivElement = js.native
  @JSName("get")
  def get_data(prop: data): js.UndefOr[js.Object | js.Any] = js.native
  @JSName("get")
  def get_forceFit(prop: forceFit): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_height(prop: height): Double = js.native
  @JSName("get")
  def get_padding(prop: padding): js.UndefOr[
    Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.native
  @JSName("get")
  def get_pixelRatio(prop: pixelRatio): js.UndefOr[Double] = js.native
  @JSName("get")
  def get_plotBackground(prop: plotBackground): js.UndefOr[typingsSlinky.antvG2.mod.Styles.background] = js.native
  @JSName("get")
  def get_theme(prop: theme): js.UndefOr[js.Object | String] = js.native
  @JSName("get")
  def get_width(prop: width): js.UndefOr[Double] = js.native
  
  def hideTooltip(): js.Any = js.native
  
  def legend(field: String, legendConfig: LegendConfig): this.type = js.native
  def legend(field: String, option: Boolean): this.type = js.native
  def legend(option: Boolean): this.type = js.native
  def legend(option: LegendConfig): this.type = js.native
  
  def on(eventNane: String, event: js.Any): js.Any = js.native
  
  def render(): Unit = js.native
  
  def showTooltip(ponit: X): js.Any = js.native
  
  def toDataURL(): String = js.native
  
  def tooltip(tooltipConfig: Boolean): this.type = js.native
  def tooltip(tooltipConfig: TooltipConfig): this.type = js.native
  
  def view(): View = js.native
  def view(option: Padding): View = js.native
}
