package typingsSlinky.activexAdox

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object ADOX extends js.Object {
    @js.native
    class Catalog protected ()
      extends typingsSlinky.activexAdox.ADOX.Catalog
    
    @js.native
    class Column protected ()
      extends typingsSlinky.activexAdox.ADOX.Column
    
    @js.native
    class Group protected ()
      extends typingsSlinky.activexAdox.ADOX.Group
    
    @js.native
    class Index protected ()
      extends typingsSlinky.activexAdox.ADOX.Index
    
    @js.native
    class Key protected ()
      extends typingsSlinky.activexAdox.ADOX.Key
    
    @js.native
    class Procedure protected ()
      extends typingsSlinky.activexAdox.ADOX.Procedure {
      /* CompleteClass */
      @JSName("ADOX.Procedure_typekey")
      override var ADOXDotProcedure_typekey: typingsSlinky.activexAdox.ADOX.Procedure = js.native
      /* CompleteClass */
      override var Command: typingsSlinky.activexAdodb.ADODB.Command = js.native
      /* CompleteClass */
      override val DateCreated: VarDate | Null = js.native
      /* CompleteClass */
      override val DateModified: VarDate | Null = js.native
      /* CompleteClass */
      override val Name: String = js.native
    }
    
    @js.native
    class Table protected ()
      extends typingsSlinky.activexAdox.ADOX.Table
    
    @js.native
    class User protected ()
      extends typingsSlinky.activexAdox.ADOX.User
    
    @js.native
    class View protected ()
      extends typingsSlinky.activexAdox.ADOX.View {
      /* CompleteClass */
      @JSName("ADOX.View_typekey")
      override var ADOXDotView_typekey: typingsSlinky.activexAdox.ADOX.View = js.native
      /* CompleteClass */
      override var Command: typingsSlinky.activexAdodb.ADODB.Command = js.native
      /* CompleteClass */
      override val DateCreated: VarDate = js.native
      /* CompleteClass */
      override val DateModified: VarDate = js.native
      /* CompleteClass */
      override val Name: String = js.native
    }
    
  }
  
}

