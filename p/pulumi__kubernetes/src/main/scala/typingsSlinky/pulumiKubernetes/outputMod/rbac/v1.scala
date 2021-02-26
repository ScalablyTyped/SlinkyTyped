package typingsSlinky.pulumiKubernetes.outputMod.rbac

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
    */
  @js.native
  trait AggregationRule extends StObject {
    
    /**
      * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
      */
    var clusterRoleSelectors: js.Array[LabelSelector] = js.native
  }
  object AggregationRule {
    
    @scala.inline
    def apply(clusterRoleSelectors: js.Array[LabelSelector]): AggregationRule = {
      val __obj = js.Dynamic.literal(clusterRoleSelectors = clusterRoleSelectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregationRule]
    }
    
    @scala.inline
    implicit class AggregationRuleMutableBuilder[Self <: AggregationRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterRoleSelectors(value: js.Array[LabelSelector]): Self = StObject.set(x, "clusterRoleSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterRoleSelectorsVarargs(value: LabelSelector*): Self = StObject.set(x, "clusterRoleSelectors", js.Array(value :_*))
    }
  }
  
  /**
    * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
    */
  @js.native
  trait ClusterRole extends StObject {
    
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
      */
    var aggregationRule: AggregationRule = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: rbacDotauthorizationDotk8sDotioSlashv1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole = js.native
    
    /**
      * Standard object's metadata.
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    var rules: js.Array[PolicyRule] = js.native
  }
  object ClusterRole {
    
    @scala.inline
    def apply(
      aggregationRule: AggregationRule,
      apiVersion: rbacDotauthorizationDotk8sDotioSlashv1,
      kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole,
      metadata: ObjectMeta,
      rules: js.Array[PolicyRule]
    ): ClusterRole = {
      val __obj = js.Dynamic.literal(aggregationRule = aggregationRule.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterRole]
    }
    
    @scala.inline
    implicit class ClusterRoleMutableBuilder[Self <: ClusterRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregationRule(value: AggregationRule): Self = StObject.set(x, "aggregationRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: js.Array[PolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: PolicyRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  /**
    * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject.
    */
  @js.native
  trait ClusterRoleBinding extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: rbacDotauthorizationDotk8sDotioSlashv1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding = js.native
    
    /**
      * Standard object's metadata.
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    var roleRef: RoleRef = js.native
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    var subjects: js.Array[Subject] = js.native
  }
  object ClusterRoleBinding {
    
    @scala.inline
    def apply(
      apiVersion: rbacDotauthorizationDotk8sDotioSlashv1,
      kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding,
      metadata: ObjectMeta,
      roleRef: RoleRef,
      subjects: js.Array[Subject]
    ): ClusterRoleBinding = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roleRef = roleRef.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterRoleBinding]
    }
    
    @scala.inline
    implicit class ClusterRoleBindingMutableBuilder[Self <: ClusterRoleBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleRef(value: RoleRef): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjects(value: js.Array[Subject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectsVarargs(value: Subject*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    }
  }
  
  /**
    * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
    */
  @js.native
  trait PolicyRule extends StObject {
    
    /**
      * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
      */
    var apiGroups: js.Array[String] = js.native
    
    /**
      * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
      */
    var nonResourceURLs: js.Array[String] = js.native
    
    /**
      * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
      */
    var resourceNames: js.Array[String] = js.native
    
    /**
      * Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
      */
    var resources: js.Array[String] = js.native
    
    /**
      * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
      */
    var verbs: js.Array[String] = js.native
  }
  object PolicyRule {
    
    @scala.inline
    def apply(
      apiGroups: js.Array[String],
      nonResourceURLs: js.Array[String],
      resourceNames: js.Array[String],
      resources: js.Array[String],
      verbs: js.Array[String]
    ): PolicyRule = {
      val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyRule]
    }
    
    @scala.inline
    implicit class PolicyRuleMutableBuilder[Self <: PolicyRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiGroups(value: js.Array[String]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiGroupsVarargs(value: String*): Self = StObject.set(x, "apiGroups", js.Array(value :_*))
      
      @scala.inline
      def setNonResourceURLs(value: js.Array[String]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonResourceURLsVarargs(value: String*): Self = StObject.set(x, "nonResourceURLs", js.Array(value :_*))
      
      @scala.inline
      def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value :_*))
    }
  }
  
  /**
    * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
    */
  @js.native
  trait Role extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: rbacDotauthorizationDotk8sDotioSlashv1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Role = js.native
    
    /**
      * Standard object's metadata.
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * Rules holds all the PolicyRules for this Role
      */
    var rules: js.Array[PolicyRule] = js.native
  }
  object Role {
    
    @scala.inline
    def apply(
      apiVersion: rbacDotauthorizationDotk8sDotioSlashv1,
      kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Role,
      metadata: ObjectMeta,
      rules: js.Array[PolicyRule]
    ): Role = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Role]
    }
    
    @scala.inline
    implicit class RoleMutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Role): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: js.Array[PolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: PolicyRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  /**
    * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
    */
  @js.native
  trait RoleBinding extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: rbacDotauthorizationDotk8sDotioSlashv1 = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding = js.native
    
    /**
      * Standard object's metadata.
      */
    var metadata: ObjectMeta = js.native
    
    /**
      * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    var roleRef: RoleRef = js.native
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    var subjects: js.Array[Subject] = js.native
  }
  object RoleBinding {
    
    @scala.inline
    def apply(
      apiVersion: rbacDotauthorizationDotk8sDotioSlashv1,
      kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding,
      metadata: ObjectMeta,
      roleRef: RoleRef,
      subjects: js.Array[Subject]
    ): RoleBinding = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], roleRef = roleRef.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleBinding]
    }
    
    @scala.inline
    implicit class RoleBindingMutableBuilder[Self <: RoleBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleRef(value: RoleRef): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjects(value: js.Array[Subject]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectsVarargs(value: Subject*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    }
  }
  
  /**
    * RoleRef contains information that points to the role being used
    */
  @js.native
  trait RoleRef extends StObject {
    
    /**
      * APIGroup is the group for the resource being referenced
      */
    var apiGroup: String = js.native
    
    /**
      * Kind is the type of resource being referenced
      */
    var kind: String = js.native
    
    /**
      * Name is the name of resource being referenced
      */
    var name: String = js.native
  }
  object RoleRef {
    
    @scala.inline
    def apply(apiGroup: String, kind: String, name: String): RoleRef = {
      val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleRef]
    }
    
    @scala.inline
    implicit class RoleRefMutableBuilder[Self <: RoleRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiGroup(value: String): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
    */
  @js.native
  trait Subject extends StObject {
    
    /**
      * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
      */
    var apiGroup: String = js.native
    
    /**
      * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
      */
    var kind: String = js.native
    
    /**
      * Name of the object being referenced.
      */
    var name: String = js.native
    
    /**
      * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
      */
    var namespace: String = js.native
  }
  object Subject {
    
    @scala.inline
    def apply(apiGroup: String, kind: String, name: String, namespace: String): Subject = {
      val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subject]
    }
    
    @scala.inline
    implicit class SubjectMutableBuilder[Self <: Subject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiGroup(value: String): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
}
