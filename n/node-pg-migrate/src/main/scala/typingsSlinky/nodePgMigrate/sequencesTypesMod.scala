package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.anon.ReverseCreateSequenceFn
import typingsSlinky.nodePgMigrate.anon.ReverseRenameSequenceFn
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Type
import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`false`
import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequencesTypesMod {
  
  type AlterSequence = js.Function2[
    /* sequenceName */ Name, 
    /* sequenceOptions */ SequenceOptionsAlter, 
    String | js.Array[String]
  ]
  
  type CreateSequence = CreateSequenceFn with ReverseCreateSequenceFn
  
  type CreateSequenceFn = js.Function2[
    /* sequenceName */ Name, 
    /* sequenceOptions */ js.UndefOr[SequenceOptionsCreate with DropOptions], 
    String | js.Array[String]
  ]
  
  type DropSequence = js.Function2[
    /* sequenceName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type RenameSequence = RenameSequenceFn with ReverseRenameSequenceFn
  
  type RenameSequenceFn = js.Function2[/* oldSequenceName */ Name, /* newSequenceName */ Name, String | js.Array[String]]
  
  @js.native
  trait SequenceOptions extends StObject {
    
    var cache: js.UndefOr[Double] = js.native
    
    var cycle: js.UndefOr[Boolean] = js.native
    
    var increment: js.UndefOr[Double] = js.native
    
    var maxvalue: js.UndefOr[Double | Null | `false`] = js.native
    
    var minvalue: js.UndefOr[Double | Null | `false`] = js.native
    
    var owner: js.UndefOr[String | Null | `false`] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
  }
  object SequenceOptions {
    
    @scala.inline
    def apply(): SequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceOptions]
    }
    
    @scala.inline
    implicit class SequenceOptionsMutableBuilder[Self <: SequenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setMaxvalue(value: Double | `false`): Self = StObject.set(x, "maxvalue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxvalueNull: Self = StObject.set(x, "maxvalue", null)
      
      @scala.inline
      def setMaxvalueUndefined: Self = StObject.set(x, "maxvalue", js.undefined)
      
      @scala.inline
      def setMinvalue(value: Double | `false`): Self = StObject.set(x, "minvalue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinvalueNull: Self = StObject.set(x, "minvalue", null)
      
      @scala.inline
      def setMinvalueUndefined: Self = StObject.set(x, "minvalue", js.undefined)
      
      @scala.inline
      def setOwner(value: String | `false`): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SequenceOptionsAlter extends SequenceOptions {
    
    var restart: js.UndefOr[Double | `true`] = js.native
  }
  object SequenceOptionsAlter {
    
    @scala.inline
    def apply(): SequenceOptionsAlter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceOptionsAlter]
    }
    
    @scala.inline
    implicit class SequenceOptionsAlterMutableBuilder[Self <: SequenceOptionsAlter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestart(value: Double | `true`): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    }
  }
  
  @js.native
  trait SequenceOptionsCreate
    extends SequenceOptions
       with IfNotExistsOption {
    
    var temporary: js.UndefOr[Boolean] = js.native
  }
  object SequenceOptionsCreate {
    
    @scala.inline
    def apply(): SequenceOptionsCreate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SequenceOptionsCreate]
    }
    
    @scala.inline
    implicit class SequenceOptionsCreateMutableBuilder[Self <: SequenceOptionsCreate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
}
