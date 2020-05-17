package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPHSystem extends js.Object {
  var densities: js.Array[Double] = js.native
  var density: Double = js.native
  var eps: Double = js.native
  var neighbors: js.Array[Double] = js.native
  var particles: js.Array[Particle] = js.native
  var pressures: js.Array[Double] = js.native
  var smoothingRadius: Double = js.native
  var speedOfSound: Double = js.native
  var viscosity: Double = js.native
  def add(particle: Particle): Unit = js.native
  def getNeighbors(particle: Particle, neighbors: js.Array[Particle]): Unit = js.native
  def gradw(rVec: Vec3, resultVec: Vec3): Unit = js.native
  def nablaw(r: Double): Double = js.native
  def remove(particle: Particle): Unit = js.native
  def update(): Unit = js.native
  def w(r: Double): Double = js.native
}

object SPHSystem {
  @scala.inline
  def apply(
    add: Particle => Unit,
    densities: js.Array[Double],
    density: Double,
    eps: Double,
    getNeighbors: (Particle, js.Array[Particle]) => Unit,
    gradw: (Vec3, Vec3) => Unit,
    nablaw: Double => Double,
    neighbors: js.Array[Double],
    particles: js.Array[Particle],
    pressures: js.Array[Double],
    remove: Particle => Unit,
    smoothingRadius: Double,
    speedOfSound: Double,
    update: () => Unit,
    viscosity: Double,
    w: Double => Double
  ): SPHSystem = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), densities = densities.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], eps = eps.asInstanceOf[js.Any], getNeighbors = js.Any.fromFunction2(getNeighbors), gradw = js.Any.fromFunction2(gradw), nablaw = js.Any.fromFunction1(nablaw), neighbors = neighbors.asInstanceOf[js.Any], particles = particles.asInstanceOf[js.Any], pressures = pressures.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), smoothingRadius = smoothingRadius.asInstanceOf[js.Any], speedOfSound = speedOfSound.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), viscosity = viscosity.asInstanceOf[js.Any], w = js.Any.fromFunction1(w))
    __obj.asInstanceOf[SPHSystem]
  }
  @scala.inline
  implicit class SPHSystemOps[Self <: SPHSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Particle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDensities(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("densities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNeighbors(value: (Particle, js.Array[Particle]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNeighbors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGradw(value: (Vec3, Vec3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNablaw(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nablaw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNeighbors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighbors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticles(value: js.Array[Particle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressures(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: Particle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSmoothingRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedOfSound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedOfSound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withViscosity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viscosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

