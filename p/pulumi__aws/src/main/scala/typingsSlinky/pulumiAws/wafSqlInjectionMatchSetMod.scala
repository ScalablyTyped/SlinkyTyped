package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafSqlInjectionMatchSetMod {
  
  @JSImport("@pulumi/aws/waf/sqlInjectionMatchSet", "SqlInjectionMatchSet")
  @js.native
  class SqlInjectionMatchSet protected () extends CustomResource {
    /**
      * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name or description of the SQL Injection Match Set.
      */
    val name: Output_[String] = js.native
    
    /**
      * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
      */
    val sqlInjectionMatchTuples: Output_[js.UndefOr[js.Array[SqlInjectionMatchSetSqlInjectionMatchTuple]]] = js.native
  }
  /* static members */
  object SqlInjectionMatchSet {
    
    /**
      * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/waf/sqlInjectionMatchSet", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws/waf/sqlInjectionMatchSet", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws/waf/sqlInjectionMatchSet", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws/waf/sqlInjectionMatchSet", "SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): SqlInjectionMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/waf/sqlInjectionMatchSet", "SqlInjectionMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
  }
  
  @js.native
  trait SqlInjectionMatchSetArgs extends StObject {
    
    /**
      * The name or description of the SQL Injection Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
      */
    val sqlInjectionMatchTuples: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple]
          ]
        ]
      ] = js.native
  }
  object SqlInjectionMatchSetArgs {
    
    @scala.inline
    def apply(): SqlInjectionMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlInjectionMatchSetArgs]
    }
    
    @scala.inline
    implicit class SqlInjectionMatchSetArgsMutableBuilder[Self <: SqlInjectionMatchSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSqlInjectionMatchTuples(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple]
              ]
            ]
      ): Self = StObject.set(x, "sqlInjectionMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlInjectionMatchTuplesUndefined: Self = StObject.set(x, "sqlInjectionMatchTuples", js.undefined)
      
      @scala.inline
      def setSqlInjectionMatchTuplesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple]*): Self = StObject.set(x, "sqlInjectionMatchTuples", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SqlInjectionMatchSetState extends StObject {
    
    /**
      * The name or description of the SQL Injection Match Set.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
      */
    val sqlInjectionMatchTuples: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple]
          ]
        ]
      ] = js.native
  }
  object SqlInjectionMatchSetState {
    
    @scala.inline
    def apply(): SqlInjectionMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlInjectionMatchSetState]
    }
    
    @scala.inline
    implicit class SqlInjectionMatchSetStateMutableBuilder[Self <: SqlInjectionMatchSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSqlInjectionMatchTuples(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple]
              ]
            ]
      ): Self = StObject.set(x, "sqlInjectionMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlInjectionMatchTuplesUndefined: Self = StObject.set(x, "sqlInjectionMatchTuples", js.undefined)
      
      @scala.inline
      def setSqlInjectionMatchTuplesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.waf.SqlInjectionMatchSetSqlInjectionMatchTuple]*): Self = StObject.set(x, "sqlInjectionMatchTuples", js.Array(value :_*))
    }
  }
}
