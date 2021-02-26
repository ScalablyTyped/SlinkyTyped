package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Conditions that determine which objects will be transferred. Applies only
  * to S3 and GCS objects.
  */
@js.native
trait SchemaObjectConditions extends StObject {
  
  /**
    * `excludePrefixes` must follow the requirements described for
    * `includePrefixes`.  The max size of `excludePrefixes` is 1000.
    */
  var excludePrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If `includePrefixes` is specified, objects that satisfy the object
    * conditions must have names that start with one of the `includePrefixes`
    * and that do not start with any of the `excludePrefixes`. If
    * `includePrefixes` is not specified, all objects except those that have
    * names starting with one of the `excludePrefixes` must satisfy the object
    * conditions.  Requirements:    * Each include-prefix and exclude-prefix
    * can contain any sequence of     Unicode characters, of max length 1024
    * bytes when UTF8-encoded, and     must not contain Carriage Return or Line
    * Feed characters.  Wildcard     matching and regular expression matching
    * are not supported.    * Each include-prefix and exclude-prefix must omit
    * the leading slash.     For example, to include the `requests.gz` object
    * in a transfer from     `s3://my-aws-bucket/logs/y=2015/requests.gz`,
    * specify the include     prefix as `logs/y=2015/requests.gz`.    * None of
    * the include-prefix or the exclude-prefix values can be empty,     if
    * specified.    * Each include-prefix must include a distinct portion of
    * the object     namespace, i.e., no include-prefix may be a prefix of
    * another     include-prefix.    * Each exclude-prefix must exclude a
    * distinct portion of the object     namespace, i.e., no exclude-prefix may
    * be a prefix of another     exclude-prefix.    * If `includePrefixes` is
    * specified, then each exclude-prefix must start     with the value of a
    * path explicitly included by `includePrefixes`.  The max size of
    * `includePrefixes` is 1000.
    */
  var includePrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If specified, only objects with a `lastModificationTime` on or after
    * `NOW` - `maxTimeElapsedSinceLastModification` and objects that don&#39;t
    * have a `lastModificationTime` are transferred.  Note that `NOW` refers to
    * the creation time of the transfer job, and `lastModificationTime` refers
    * to the time of the last change to the object&#39;s content or metadata.
    * Specifically, this would be the `updated` property of GCS objects and the
    * `LastModified` field of S3 objects.
    */
  var maxTimeElapsedSinceLastModification: js.UndefOr[String] = js.native
  
  /**
    * If specified, only objects with a `lastModificationTime` before `NOW` -
    * `minTimeElapsedSinceLastModification` and objects that don&#39;t have a
    * `lastModificationTime` are transferred.  Note that `NOW` refers to the
    * creation time of the transfer job, and `lastModificationTime` refers to
    * the time of the last change to the object&#39;s content or metadata.
    * Specifically, this would be the `updated` property of GCS objects and the
    * `LastModified` field of S3 objects.
    */
  var minTimeElapsedSinceLastModification: js.UndefOr[String] = js.native
}
object SchemaObjectConditions {
  
  @scala.inline
  def apply(): SchemaObjectConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectConditions]
  }
  
  @scala.inline
  implicit class SchemaObjectConditionsMutableBuilder[Self <: SchemaObjectConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludePrefixes(value: js.Array[String]): Self = StObject.set(x, "excludePrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePrefixesUndefined: Self = StObject.set(x, "excludePrefixes", js.undefined)
    
    @scala.inline
    def setExcludePrefixesVarargs(value: String*): Self = StObject.set(x, "excludePrefixes", js.Array(value :_*))
    
    @scala.inline
    def setIncludePrefixes(value: js.Array[String]): Self = StObject.set(x, "includePrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePrefixesUndefined: Self = StObject.set(x, "includePrefixes", js.undefined)
    
    @scala.inline
    def setIncludePrefixesVarargs(value: String*): Self = StObject.set(x, "includePrefixes", js.Array(value :_*))
    
    @scala.inline
    def setMaxTimeElapsedSinceLastModification(value: String): Self = StObject.set(x, "maxTimeElapsedSinceLastModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeElapsedSinceLastModificationUndefined: Self = StObject.set(x, "maxTimeElapsedSinceLastModification", js.undefined)
    
    @scala.inline
    def setMinTimeElapsedSinceLastModification(value: String): Self = StObject.set(x, "minTimeElapsedSinceLastModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTimeElapsedSinceLastModificationUndefined: Self = StObject.set(x, "minTimeElapsedSinceLastModification", js.undefined)
  }
}
