package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyStructureUpdate extends StObject {
  
  /**
    * The update for level five.
    */
  var LevelFive: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level four.
    */
  var LevelFour: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level one.
    */
  var LevelOne: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level three.
    */
  var LevelThree: js.UndefOr[HierarchyLevelUpdate] = js.native
  
  /**
    * The update for level two.
    */
  var LevelTwo: js.UndefOr[HierarchyLevelUpdate] = js.native
}
object HierarchyStructureUpdate {
  
  @scala.inline
  def apply(): HierarchyStructureUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyStructureUpdate]
  }
  
  @scala.inline
  implicit class HierarchyStructureUpdateMutableBuilder[Self <: HierarchyStructureUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevelFive(value: HierarchyLevelUpdate): Self = StObject.set(x, "LevelFive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFiveUndefined: Self = StObject.set(x, "LevelFive", js.undefined)
    
    @scala.inline
    def setLevelFour(value: HierarchyLevelUpdate): Self = StObject.set(x, "LevelFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelFourUndefined: Self = StObject.set(x, "LevelFour", js.undefined)
    
    @scala.inline
    def setLevelOne(value: HierarchyLevelUpdate): Self = StObject.set(x, "LevelOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelOneUndefined: Self = StObject.set(x, "LevelOne", js.undefined)
    
    @scala.inline
    def setLevelThree(value: HierarchyLevelUpdate): Self = StObject.set(x, "LevelThree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelThreeUndefined: Self = StObject.set(x, "LevelThree", js.undefined)
    
    @scala.inline
    def setLevelTwo(value: HierarchyLevelUpdate): Self = StObject.set(x, "LevelTwo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelTwoUndefined: Self = StObject.set(x, "LevelTwo", js.undefined)
  }
}
