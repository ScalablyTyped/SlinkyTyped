package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.resourceMod.CustomResource
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("@pulumi/pulumi/dynamic", "Resource")
  @js.native
  abstract class Resource protected () extends CustomResource {
    /**
      * Creates a new dynamic resource.
      *
      * @param provider The implementation of the resource's CRUD operations.
      * @param name The name of the resource.
      * @param props The arguments to use to populate the new resource. Must not define the reserved
      *              property "__provider".
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(provider: ResourceProvider, name: String, props: Inputs) = this()
    def this(provider: ResourceProvider, name: String, props: Inputs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  trait CheckFailure extends StObject {
    
    /**
      * The property that failed validation.
      */
    val property: String = js.native
    
    /**
      * The reason that the property failed validation.
      */
    val reason: String = js.native
  }
  object CheckFailure {
    
    @scala.inline
    def apply(property: String, reason: String): CheckFailure = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckFailure]
    }
    
    @scala.inline
    implicit class CheckFailureMutableBuilder[Self <: CheckFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckResult extends StObject {
    
    /**
      * Any validation failures that occurred.
      */
    val failures: js.UndefOr[js.Array[CheckFailure]] = js.native
    
    /**
      * The inputs to use, if any.
      */
    val inputs: js.UndefOr[js.Any] = js.native
  }
  object CheckResult {
    
    @scala.inline
    def apply(): CheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckResult]
    }
    
    @scala.inline
    implicit class CheckResultMutableBuilder[Self <: CheckResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailures(value: js.Array[CheckFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
      
      @scala.inline
      def setFailuresVarargs(value: CheckFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    }
  }
  
  @js.native
  trait CreateResult extends StObject {
    
    /**
      * The ID of the created resource.
      */
    val id: ID = js.native
    
    /**
      * Any properties that were computed during creation.
      */
    val outs: js.UndefOr[js.Any] = js.native
  }
  object CreateResult {
    
    @scala.inline
    def apply(id: ID): CreateResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateResult]
    }
    
    @scala.inline
    implicit class CreateResultMutableBuilder[Self <: CreateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuts(value: js.Any): Self = StObject.set(x, "outs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsUndefined: Self = StObject.set(x, "outs", js.undefined)
    }
  }
  
  @js.native
  trait DiffResult extends StObject {
    
    /**
      * If true, this diff detected changes and suggests an update.
      */
    val changes: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
      * void potential side-by-side issues with the default create before delete behavior.
      */
    val deleteBeforeReplace: js.UndefOr[Boolean] = js.native
    
    /**
      * If this update requires a replacement, the set of properties triggering it.
      */
    val replaces: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An optional list of properties that will not ever change.
      */
    val stables: js.UndefOr[js.Array[String]] = js.native
  }
  object DiffResult {
    
    @scala.inline
    def apply(): DiffResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffResult]
    }
    
    @scala.inline
    implicit class DiffResultMutableBuilder[Self <: DiffResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChanges(value: Boolean): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      @scala.inline
      def setDeleteBeforeReplace(value: Boolean): Self = StObject.set(x, "deleteBeforeReplace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteBeforeReplaceUndefined: Self = StObject.set(x, "deleteBeforeReplace", js.undefined)
      
      @scala.inline
      def setReplaces(value: js.Array[String]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
      
      @scala.inline
      def setReplacesVarargs(value: String*): Self = StObject.set(x, "replaces", js.Array(value :_*))
      
      @scala.inline
      def setStables(value: js.Array[String]): Self = StObject.set(x, "stables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStablesUndefined: Self = StObject.set(x, "stables", js.undefined)
      
      @scala.inline
      def setStablesVarargs(value: String*): Self = StObject.set(x, "stables", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReadResult extends StObject {
    
    /**
      * The ID of the resource ready back (or blank if missing).
      */
    val id: js.UndefOr[ID] = js.native
    
    /**
      * The current property state read from the live environment.
      */
    val props: js.UndefOr[js.Any] = js.native
  }
  object ReadResult {
    
    @scala.inline
    def apply(): ReadResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadResult]
    }
    
    @scala.inline
    implicit class ReadResultMutableBuilder[Self <: ReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  @js.native
  trait ResourceProvider extends StObject {
    
    /**
      * Check validates that the given property bag is valid for a resource of the given type.
      *
      * @param olds The old input properties to use for validation.
      * @param news The new input properties to use for validation.
      */
    var check: js.UndefOr[js.Function2[/* olds */ js.Any, /* news */ js.Any, js.Promise[CheckResult]]] = js.native
    
    /**
      * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
      * If this call fails, the resource must not have been created (i.e., it is "transactional").
      *
      * @param inputs The properties to set during creation.
      */
    def create(inputs: js.Any): js.Promise[CreateResult] = js.native
    
    /**
      * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
      *
      * @param id The ID of the resource to delete.
      * @param props The current properties on the resource.
      */
    var delete: js.UndefOr[js.Function2[/* id */ ID, /* props */ js.Any, js.Promise[Unit]]] = js.native
    
    /**
      * Diff checks what impacts a hypothetical update will have on the resource's properties.
      *
      * @param id The ID of the resource to diff.
      * @param olds The old values of properties to diff.
      * @param news The new values of properties to diff.
      */
    var diff: js.UndefOr[
        js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[DiffResult]]
      ] = js.native
    
    /**
      * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
      * identify the resource; this is typically just the resource ID, but it may also include some properties.
      */
    var read: js.UndefOr[
        js.Function2[/* id */ ID, /* props */ js.UndefOr[js.Any], js.Promise[ReadResult]]
      ] = js.native
    
    /**
      * Update updates an existing resource with new values.
      *
      * @param id The ID of the resource to update.
      * @param olds The old values of properties to update.
      * @param news The new values of properties to update.
      */
    var update: js.UndefOr[
        js.Function3[/* id */ ID, /* olds */ js.Any, /* news */ js.Any, js.Promise[UpdateResult]]
      ] = js.native
  }
  object ResourceProvider {
    
    @scala.inline
    def apply(create: js.Any => js.Promise[CreateResult]): ResourceProvider = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[ResourceProvider]
    }
    
    @scala.inline
    implicit class ResourceProviderMutableBuilder[Self <: ResourceProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: (/* olds */ js.Any, /* news */ js.Any) => js.Promise[CheckResult]): Self = StObject.set(x, "check", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setCreate(value: js.Any => js.Promise[CreateResult]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelete(value: (/* id */ ID, /* props */ js.Any) => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDiff(value: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => js.Promise[DiffResult]): Self = StObject.set(x, "diff", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      @scala.inline
      def setRead(value: (/* id */ ID, /* props */ js.UndefOr[js.Any]) => js.Promise[ReadResult]): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setUpdate(value: (/* id */ ID, /* olds */ js.Any, /* news */ js.Any) => js.Promise[UpdateResult]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait UpdateResult extends StObject {
    
    /**
      * Any properties that were computed during updating.
      */
    val outs: js.UndefOr[js.Any] = js.native
  }
  object UpdateResult {
    
    @scala.inline
    def apply(): UpdateResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResult]
    }
    
    @scala.inline
    implicit class UpdateResultMutableBuilder[Self <: UpdateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOuts(value: js.Any): Self = StObject.set(x, "outs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutsUndefined: Self = StObject.set(x, "outs", js.undefined)
    }
  }
}
