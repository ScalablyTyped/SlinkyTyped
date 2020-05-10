package typingsSlinky.nestdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persistence extends js.Object {
  def compactDatafile(): Unit = js.native
  def setAutocompactionInterval(interval: Double): Unit = js.native
  def stopAutocompaction(): Unit = js.native
}

object Persistence {
  @scala.inline
  def apply(
    compactDatafile: () => Unit,
    setAutocompactionInterval: Double => Unit,
    stopAutocompaction: () => Unit
  ): Persistence = {
    val __obj = js.Dynamic.literal(compactDatafile = js.Any.fromFunction0(compactDatafile), setAutocompactionInterval = js.Any.fromFunction1(setAutocompactionInterval), stopAutocompaction = js.Any.fromFunction0(stopAutocompaction))
    __obj.asInstanceOf[Persistence]
  }
  @scala.inline
  implicit class PersistenceOps[Self <: Persistence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactDatafile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactDatafile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAutocompactionInterval(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutocompactionInterval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopAutocompaction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAutocompaction")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

