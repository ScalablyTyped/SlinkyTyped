package typingsSlinky.activexAdodb

import typingsSlinky.activexAdodb.ADODB.DataTypeEnum
import typingsSlinky.activexAdodb.ADODB.PropertyAttributesEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object ADODB extends js.Object {
    @js.native
    class Bookmark protected ()
      extends typingsSlinky.activexAdodb.ADODB.Bookmark {
      /* CompleteClass */
      @JSName("ADODB.Bookmark_typekey")
      override var ADODBDotBookmark_typekey: typingsSlinky.activexAdodb.ADODB.Bookmark = js.native
    }
    
    @js.native
    class Command protected ()
      extends typingsSlinky.activexAdodb.ADODB.Command
    
    @js.native
    class Connection protected ()
      extends typingsSlinky.activexAdodb.ADODB.Connection
    
    @js.native
    class Error protected ()
      extends typingsSlinky.activexAdodb.ADODB.Error {
      /* CompleteClass */
      @JSName("ADODB.Error_typekey")
      override var ADODBDotError_typekey: typingsSlinky.activexAdodb.ADODB.Error = js.native
      /* CompleteClass */
      override val Description: String = js.native
      /* CompleteClass */
      override val HelpContext: Double = js.native
      /* CompleteClass */
      override val HelpFile: String = js.native
      /* CompleteClass */
      override val NativeError: Double = js.native
      /* CompleteClass */
      override val Number: Double = js.native
      /* CompleteClass */
      override val SQLState: String = js.native
      /* CompleteClass */
      override val Source: String = js.native
    }
    
    @js.native
    class Field protected ()
      extends typingsSlinky.activexAdodb.ADODB.Field
    
    @js.native
    class Parameter protected ()
      extends typingsSlinky.activexAdodb.ADODB.Parameter
    
    @js.native
    class Property protected ()
      extends typingsSlinky.activexAdodb.ADODB.Property {
      /* CompleteClass */
      @JSName("ADODB.Property_typekey")
      override var ADODBDotProperty_typekey: typingsSlinky.activexAdodb.ADODB.Property = js.native
      /** Sum of one or more of the values in the **PropertyAttributesEnum** enum */
      /* CompleteClass */
      override var Attributes: PropertyAttributesEnum = js.native
      /* CompleteClass */
      override val Name: String = js.native
      /* CompleteClass */
      override val Type: DataTypeEnum = js.native
      /* CompleteClass */
      override var Value: js.Any = js.native
    }
    
    @js.native
    class Record protected ()
      extends typingsSlinky.activexAdodb.ADODB.Record
    
    @js.native
    class Stream protected ()
      extends typingsSlinky.activexAdodb.ADODB.Stream
    
  }
  
}

