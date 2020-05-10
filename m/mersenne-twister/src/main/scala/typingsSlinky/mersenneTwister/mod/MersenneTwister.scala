package typingsSlinky.mersenneTwister.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MersenneTwister extends js.Object {
  /**
    * initializes mt with a number
    */
  def init_seed(seed: Double): Unit = js.native
  /**
    * generates a random number on [0,1)-real-interval
    */
  def random(): Double = js.native
  /**
    * generates a random number on (0,1)-real-interval
    */
  def random_excl(): Double = js.native
  /**
    * generates a random number on [0,1]-real-interval
    */
  def random_incl(): Double = js.native
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  def random_int(): Double = js.native
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  def random_int31(): Double = js.native
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  def random_long(): Double = js.native
}

object MersenneTwister {
  @scala.inline
  def apply(
    init_seed: Double => Unit,
    random: () => Double,
    random_excl: () => Double,
    random_incl: () => Double,
    random_int: () => Double,
    random_int31: () => Double,
    random_long: () => Double
  ): MersenneTwister = {
    val __obj = js.Dynamic.literal(init_seed = js.Any.fromFunction1(init_seed), random = js.Any.fromFunction0(random), random_excl = js.Any.fromFunction0(random_excl), random_incl = js.Any.fromFunction0(random_incl), random_int = js.Any.fromFunction0(random_int), random_int31 = js.Any.fromFunction0(random_int31), random_long = js.Any.fromFunction0(random_long))
    __obj.asInstanceOf[MersenneTwister]
  }
  @scala.inline
  implicit class MersenneTwisterOps[Self <: MersenneTwister] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit_seed(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init_seed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRandom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRandom_excl(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random_excl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRandom_incl(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random_incl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRandom_int(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random_int")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRandom_int31(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random_int31")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRandom_long(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random_long")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

