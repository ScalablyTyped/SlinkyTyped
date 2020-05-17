package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcfgutils extends js.Object {
  def abort(): Double = js.native
  def core_hash(s1: String, s2: String, sz: Double): Double = js.native
  def lock(lkey: String): Double = js.native
  def pkg_status(): Double = js.native
  def pkg_summary(): Double = js.native
  def rand_event(): Double = js.native
  def rand_get_prob(): Double = js.native
  def rand_reset_prob(): Double = js.native
  def rand_set_prob(percent_par: Double): Double = js.native
  def shm_status(): Double = js.native
  def shm_summary(): Double = js.native
  def trylock(lkey: String): Double = js.native
  def unlock(lkey: String): Double = js.native
}

object Typeofcfgutils {
  @scala.inline
  def apply(
    abort: () => Double,
    core_hash: (String, String, Double) => Double,
    lock: String => Double,
    pkg_status: () => Double,
    pkg_summary: () => Double,
    rand_event: () => Double,
    rand_get_prob: () => Double,
    rand_reset_prob: () => Double,
    rand_set_prob: Double => Double,
    shm_status: () => Double,
    shm_summary: () => Double,
    trylock: String => Double,
    unlock: String => Double
  ): Typeofcfgutils = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), core_hash = js.Any.fromFunction3(core_hash), lock = js.Any.fromFunction1(lock), pkg_status = js.Any.fromFunction0(pkg_status), pkg_summary = js.Any.fromFunction0(pkg_summary), rand_event = js.Any.fromFunction0(rand_event), rand_get_prob = js.Any.fromFunction0(rand_get_prob), rand_reset_prob = js.Any.fromFunction0(rand_reset_prob), rand_set_prob = js.Any.fromFunction1(rand_set_prob), shm_status = js.Any.fromFunction0(shm_status), shm_summary = js.Any.fromFunction0(shm_summary), trylock = js.Any.fromFunction1(trylock), unlock = js.Any.fromFunction1(unlock))
    __obj.asInstanceOf[Typeofcfgutils]
  }
  @scala.inline
  implicit class TypeofcfgutilsOps[Self <: Typeofcfgutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCore_hash(value: (String, String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core_hash")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLock(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPkg_status(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg_status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPkg_summary(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg_summary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRand_event(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand_event")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRand_get_prob(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand_get_prob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRand_reset_prob(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand_reset_prob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRand_set_prob(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rand_set_prob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShm_status(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shm_status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShm_summary(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shm_summary")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrylock(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trylock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlock(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

