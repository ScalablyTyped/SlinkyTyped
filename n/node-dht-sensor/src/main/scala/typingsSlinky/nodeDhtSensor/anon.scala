package typingsSlinky.nodeDhtSensor

import typingsSlinky.nodeDhtSensor.mod.SensorData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fake extends StObject {
    
    var fake: SensorData = js.native
  }
  object Fake {
    
    @scala.inline
    def apply(fake: SensorData): Fake = {
      val __obj = js.Dynamic.literal(fake = fake.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fake]
    }
    
    @scala.inline
    implicit class FakeMutableBuilder[Self <: Fake] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFake(value: SensorData): Self = StObject.set(x, "fake", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Test extends StObject {
    
    var test: Fake = js.native
  }
  object Test {
    
    @scala.inline
    def apply(test: Fake): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit class TestMutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTest(value: Fake): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
}
