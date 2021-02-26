package typingsSlinky.officeJs.OneNote

import typingsSlinky.officeJs.officeJsStrings.Bullet
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * List information for paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ParagraphInfo extends StObject {
  
  /**
    *
    * //
    Bullet list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var bulletType: String = js.native
  
  /**
    *
    * //
    Index of paragraph in list
    *
    * [Api set: OneNoteApi 1.1]
    */
  var index: Double = js.native
  
  /**
    *
    * //
    Type of list in paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var listType: ListType | None | Number | Bullet = js.native
  
  /**
    *
    * //
    number list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
}
object ParagraphInfo {
  
  @scala.inline
  def apply(
    bulletType: String,
    index: Double,
    listType: ListType | None | Number | Bullet,
    numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
  ): ParagraphInfo = {
    val __obj = js.Dynamic.literal(bulletType = bulletType.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], numberType = numberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphInfo]
  }
  
  @scala.inline
  implicit class ParagraphInfoMutableBuilder[Self <: ParagraphInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletType(value: String): Self = StObject.set(x, "bulletType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListType(value: ListType | None | Number | Bullet): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
  }
}
