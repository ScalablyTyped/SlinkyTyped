package typingsSlinky.box2d.Box2D.Dynamics.Contacts

import typingsSlinky.box2d.Box2D.Collision.b2Manifold
import typingsSlinky.box2d.Box2D.Collision.b2WorldManifold
import typingsSlinky.box2d.Box2D.Dynamics.b2Fixture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Contact extends js.Object {
  /**
  		* Flag this contact for filtering. Filtering will occur the next time step.
  		**/
  def FlagForFiltering(): Unit = js.native
  /**
  		* Get the first fixture in this contact.
  		* @return First fixture in this contact.
  		**/
  def GetFixtureA(): b2Fixture = js.native
  /**
  		* Get the second fixture in this contact.
  		* @return Second fixture in this contact.
  		**/
  def GetFixtureB(): b2Fixture = js.native
  /**
  		* Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
  		* @return Contact manifold.
  		**/
  def GetManifold(): b2Manifold = js.native
  /**
  		* Get the next contact in the world's contact list.
  		* @return Next contact in the world's contact list.
  		**/
  def GetNext(): b2Contact = js.native
  /**
  		* Get the world manifold.
  		* @param worldManifold World manifold out.
  		* @return World manifold.
  		**/
  def GetWorldManifold(worldManifold: b2WorldManifold): Unit = js.native
  /**
  		* Does this contact generate TOI events for continuous simulation.
  		* @return True for continous, otherwise false.
  		**/
  def IsContinuous(): Boolean = js.native
  /**
  		* Has this contact been disabled?
  		* @return True if disabled, otherwise false.
  		**/
  def IsEnabled(): Boolean = js.native
  /**
  		* Is this contact a sensor?
  		* @return True if sensor, otherwise false.
  		**/
  def IsSensor(): Boolean = js.native
  /**
  		* Is this contact touching.
  		* @return True if contact is touching, otherwise false.
  		**/
  def IsTouching(): Boolean = js.native
  /**
  		* Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
  		* @param flag True to enable, false to disable.
  		**/
  def SetEnabled(flag: Boolean): Unit = js.native
  /**
  		* Change this to be a sensor or-non-sensor contact.
  		* @param sensor True to be sensor, false to not be a sensor.
  		**/
  def SetSensor(sensor: Boolean): Unit = js.native
}

object b2Contact {
  @scala.inline
  def apply(
    FlagForFiltering: () => Unit,
    GetFixtureA: () => b2Fixture,
    GetFixtureB: () => b2Fixture,
    GetManifold: () => b2Manifold,
    GetNext: () => b2Contact,
    GetWorldManifold: b2WorldManifold => Unit,
    IsContinuous: () => Boolean,
    IsEnabled: () => Boolean,
    IsSensor: () => Boolean,
    IsTouching: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetSensor: Boolean => Unit
  ): b2Contact = {
    val __obj = js.Dynamic.literal(FlagForFiltering = js.Any.fromFunction0(FlagForFiltering), GetFixtureA = js.Any.fromFunction0(GetFixtureA), GetFixtureB = js.Any.fromFunction0(GetFixtureB), GetManifold = js.Any.fromFunction0(GetManifold), GetNext = js.Any.fromFunction0(GetNext), GetWorldManifold = js.Any.fromFunction1(GetWorldManifold), IsContinuous = js.Any.fromFunction0(IsContinuous), IsEnabled = js.Any.fromFunction0(IsEnabled), IsSensor = js.Any.fromFunction0(IsSensor), IsTouching = js.Any.fromFunction0(IsTouching), SetEnabled = js.Any.fromFunction1(SetEnabled), SetSensor = js.Any.fromFunction1(SetSensor))
    __obj.asInstanceOf[b2Contact]
  }
  @scala.inline
  implicit class b2ContactOps[Self <: b2Contact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlagForFiltering(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlagForFiltering")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFixtureA(value: () => b2Fixture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFixtureA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFixtureB(value: () => b2Fixture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFixtureB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetManifold(value: () => b2Manifold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetManifold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNext(value: () => b2Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorldManifold(value: b2WorldManifold => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWorldManifold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsContinuous(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsContinuous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSensor(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSensor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTouching(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTouching")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSensor(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSensor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

