package typingsSlinky.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iam {
  
  @js.native
  trait GetGroupUser extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the iam user.
      */
    var arn: String = js.native
    
    /**
      * The path to the iam user.
      */
    var path: String = js.native
    
    /**
      * The stable and unique string identifying the iam user.
      */
    var userId: String = js.native
    
    /**
      * The name of the iam user.
      */
    var userName: String = js.native
  }
  object GetGroupUser {
    
    @scala.inline
    def apply(arn: String, path: String, userId: String, userName: String): GetGroupUser = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroupUser]
    }
    
    @scala.inline
    implicit class GetGroupUserMutableBuilder[Self <: GetGroupUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPolicyDocumentStatement extends StObject {
    
    /**
      * A list of actions that this statement either allows
      * or denies. For example, ``["ec2:RunInstances", "s3:*"]``.
      */
    var actions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A nested configuration block (described below)
      * that defines a further, possibly-service-specific condition that constrains
      * whether this statement applies.
      */
    var conditions: js.UndefOr[js.Array[GetPolicyDocumentStatementCondition]] = js.native
    
    /**
      * Either "Allow" or "Deny", to specify whether this
      * statement allows or denies the given actions. The default is "Allow".
      */
    var effect: js.UndefOr[String] = js.native
    
    /**
      * A list of actions that this statement does *not*
      * apply to. Used to apply a policy statement to all actions *except* those
      * listed.
      */
    var notActions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Like `principals` except gives principals that
      * the statement does *not* apply to.
      */
    var notPrincipals: js.UndefOr[js.Array[GetPolicyDocumentStatementNotPrincipal]] = js.native
    
    /**
      * A list of resource ARNs that this statement
      * does *not* apply to. Used to apply a policy statement to all resources
      * *except* those listed.
      */
    var notResources: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A nested configuration block (described below)
      * specifying a principal (or principal pattern) to which this statement applies.
      */
    var principals: js.UndefOr[js.Array[GetPolicyDocumentStatementPrincipal]] = js.native
    
    /**
      * A list of resource ARNs that this statement applies
      * to. This is required by AWS if used for an IAM policy.
      */
    var resources: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An ID for the policy statement.
      */
    var sid: js.UndefOr[String] = js.native
  }
  object GetPolicyDocumentStatement {
    
    @scala.inline
    def apply(): GetPolicyDocumentStatement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPolicyDocumentStatement]
    }
    
    @scala.inline
    implicit class GetPolicyDocumentStatementMutableBuilder[Self <: GetPolicyDocumentStatement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setConditions(value: js.Array[GetPolicyDocumentStatementCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      @scala.inline
      def setConditionsVarargs(value: GetPolicyDocumentStatementCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      
      @scala.inline
      def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setNotActions(value: js.Array[String]): Self = StObject.set(x, "notActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotActionsUndefined: Self = StObject.set(x, "notActions", js.undefined)
      
      @scala.inline
      def setNotActionsVarargs(value: String*): Self = StObject.set(x, "notActions", js.Array(value :_*))
      
      @scala.inline
      def setNotPrincipals(value: js.Array[GetPolicyDocumentStatementNotPrincipal]): Self = StObject.set(x, "notPrincipals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotPrincipalsUndefined: Self = StObject.set(x, "notPrincipals", js.undefined)
      
      @scala.inline
      def setNotPrincipalsVarargs(value: GetPolicyDocumentStatementNotPrincipal*): Self = StObject.set(x, "notPrincipals", js.Array(value :_*))
      
      @scala.inline
      def setNotResources(value: js.Array[String]): Self = StObject.set(x, "notResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotResourcesUndefined: Self = StObject.set(x, "notResources", js.undefined)
      
      @scala.inline
      def setNotResourcesVarargs(value: String*): Self = StObject.set(x, "notResources", js.Array(value :_*))
      
      @scala.inline
      def setPrincipals(value: js.Array[GetPolicyDocumentStatementPrincipal]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
      
      @scala.inline
      def setPrincipalsVarargs(value: GetPolicyDocumentStatementPrincipal*): Self = StObject.set(x, "principals", js.Array(value :_*))
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
  
  @js.native
  trait GetPolicyDocumentStatementCondition extends StObject {
    
    /**
      * The name of the
      * [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html)
      * to evaluate.
      */
    var test: String = js.native
    
    /**
      * The values to evaluate the condition against. If multiple
      * values are provided, the condition matches if at least one of them applies.
      * (That is, the tests are combined with the "OR" boolean operation.)
      */
    var values: js.Array[String] = js.native
    
    /**
      * The name of a
      * [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys)
      * to apply the condition to. Context variables may either be standard AWS
      * variables starting with `aws:`, or service-specific variables prefixed with
      * the service name.
      */
    var variable: String = js.native
  }
  object GetPolicyDocumentStatementCondition {
    
    @scala.inline
    def apply(test: String, values: js.Array[String], variable: String): GetPolicyDocumentStatementCondition = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyDocumentStatementCondition]
    }
    
    @scala.inline
    implicit class GetPolicyDocumentStatementConditionMutableBuilder[Self <: GetPolicyDocumentStatementCondition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPolicyDocumentStatementNotPrincipal extends StObject {
    
    /**
      * List of identifiers for principals. When `type`
      * is "AWS", these are IAM user or role ARNs.  When `type` is "Service", these are AWS Service roles e.g. `lambda.amazonaws.com`. When `type` is "Federated", these are web identity users or SAML provider ARNs.
      */
    var identifiers: js.Array[String] = js.native
    
    /**
      * The type of principal. For AWS ARNs this is "AWS".  For AWS services (e.g. Lambda), this is "Service". For Federated access the type is "Federated".
      */
    var `type`: String = js.native
  }
  object GetPolicyDocumentStatementNotPrincipal {
    
    @scala.inline
    def apply(identifiers: js.Array[String], `type`: String): GetPolicyDocumentStatementNotPrincipal = {
      val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyDocumentStatementNotPrincipal]
    }
    
    @scala.inline
    implicit class GetPolicyDocumentStatementNotPrincipalMutableBuilder[Self <: GetPolicyDocumentStatementNotPrincipal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifiers(value: js.Array[String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPolicyDocumentStatementPrincipal extends StObject {
    
    /**
      * List of identifiers for principals. When `type`
      * is "AWS", these are IAM user or role ARNs.  When `type` is "Service", these are AWS Service roles e.g. `lambda.amazonaws.com`. When `type` is "Federated", these are web identity users or SAML provider ARNs.
      */
    var identifiers: js.Array[String] = js.native
    
    /**
      * The type of principal. For AWS ARNs this is "AWS".  For AWS services (e.g. Lambda), this is "Service". For Federated access the type is "Federated".
      */
    var `type`: String = js.native
  }
  object GetPolicyDocumentStatementPrincipal {
    
    @scala.inline
    def apply(identifiers: js.Array[String], `type`: String): GetPolicyDocumentStatementPrincipal = {
      val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyDocumentStatementPrincipal]
    }
    
    @scala.inline
    implicit class GetPolicyDocumentStatementPrincipalMutableBuilder[Self <: GetPolicyDocumentStatementPrincipal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifiers(value: js.Array[String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
