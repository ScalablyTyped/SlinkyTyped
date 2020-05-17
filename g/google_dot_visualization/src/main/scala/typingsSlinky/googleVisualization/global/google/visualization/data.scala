package typingsSlinky.googleVisualization.global.google.visualization

import typingsSlinky.googleVisualization.google.visualization.GroupColumnOptions
import typingsSlinky.googleVisualization.google.visualization.GroupKeyOptions
import typingsSlinky.googleVisualization.googleVisualizationStrings.full
import typingsSlinky.googleVisualization.googleVisualizationStrings.inner
import typingsSlinky.googleVisualization.googleVisualizationStrings.left
import typingsSlinky.googleVisualization.googleVisualizationStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.data")
@js.native
class data ()
  extends typingsSlinky.googleVisualization.google.visualization.data

/* static members */
@JSGlobal("google.visualization.data")
@js.native
object data extends js.Object {
  def avg(values: js.Array[js.Date | Double | String]): Double = js.native
  def count(values: js.Array[_]): Double = js.native
  def group(
    data: typingsSlinky.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  def group(
    data: typingsSlinky.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  def group(
    data: typingsSlinky.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  def group(
    data: typingsSlinky.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  // https://developers.google.com/chart/interactive/docs/reference#join
  @JSName("join")
  def join_full(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataTable,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typingsSlinky.googleVisualization.google.visualization.DataView,
    dataB: typingsSlinky.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typingsSlinky.googleVisualization.google.visualization.DataTable = js.native
  def max(values: js.Array[js.Date | Double | String]): Double | String | js.Date = js.native
  def min(values: js.Array[js.Date | Double | String]): Double | String | js.Date = js.native
  // https://developers.google.com/chart/interactive/docs/reference#data_modifier_functions
  def month(value: js.Date): Double = js.native
  // https://developers.google.com/chart/interactive/docs/reference#group
  def sum(values: js.Array[js.Date | Double | String]): Double = js.native
}

