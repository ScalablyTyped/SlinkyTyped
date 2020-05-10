package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetBands extends js.Object {
  val ds: Dataset = js.native
  def count(): Double = js.native
  def create(dataType: Double): RasterBand = js.native
  def forEach(callback: js.Function2[/* band */ RasterBand, /* i */ Double, Unit]): Unit = js.native
  def get(id: Double): RasterBand = js.native
  def map[T](callback: js.Function2[/* band */ RasterBand, /* i */ Double, T]): js.Array[T] = js.native
}

object DatasetBands {
  @scala.inline
  def apply(
    count: () => Double,
    create: Double => RasterBand,
    ds: Dataset,
    forEach: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit,
    get: Double => RasterBand,
    map: js.Function2[/* band */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]
  ): DatasetBands = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), create = js.Any.fromFunction1(create), ds = ds.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[DatasetBands]
  }
  @scala.inline
  implicit class DatasetBandsOps[Self <: DatasetBands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreate(value: Double => RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDs(value: Dataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForEach(value: js.Function2[/* band */ RasterBand, /* i */ Double, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(value: js.Function2[/* band */ RasterBand, /* i */ Double, js.Any] => js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

