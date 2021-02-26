package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectReference contains enough information to let you inspect or modify the referred object.
  */
@js.native
trait ObjectReference extends StObject {
  
  /**
    * API version of the referent.
    */
  var apiVersion: String = js.native
  
  /**
    * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
    */
  var fieldPath: String = js.native
  
  /**
    * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: String = js.native
  
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
  
  /**
    * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
    */
  var namespace: String = js.native
  
  /**
    * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: String = js.native
  
  /**
    * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
    */
  var uid: String = js.native
}
object ObjectReference {
  
  @scala.inline
  def apply(
    apiVersion: String,
    fieldPath: String,
    kind: String,
    name: String,
    namespace: String,
    resourceVersion: String,
    uid: String
  ): ObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReference]
  }
  
  @scala.inline
  implicit class ObjectReferenceMutableBuilder[Self <: ObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
