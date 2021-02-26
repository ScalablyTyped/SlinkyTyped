package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaBookmarks extends StObject {
  
  def Add(Position: Double, Name: String): MediaBookmark = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): MediaBookmark = js.native
  
  @JSName("PowerPoint.MediaBookmarks_typekey")
  var PowerPointDotMediaBookmarks_typekey: MediaBookmarks = js.native
}
object MediaBookmarks {
  
  @scala.inline
  def apply(
    Add: (Double, String) => MediaBookmark,
    Count: Double,
    Item: Double => MediaBookmark,
    PowerPointDotMediaBookmarks_typekey: MediaBookmarks
  ): MediaBookmarks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.MediaBookmarks_typekey")(PowerPointDotMediaBookmarks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBookmarks]
  }
  
  @scala.inline
  implicit class MediaBookmarksMutableBuilder[Self <: MediaBookmarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, String) => MediaBookmark): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => MediaBookmark): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPowerPointDotMediaBookmarks_typekey(value: MediaBookmarks): Self = StObject.set(x, "PowerPoint.MediaBookmarks_typekey", value.asInstanceOf[js.Any])
  }
}
