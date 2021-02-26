package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters facilitate setting and delivering data into the pipeline&#39;s
  * execution environment. They are defined at create time, with optional
  * defaults, and can be overridden at run time.  If `localCopy` is unset, then
  * the parameter specifies a string that is passed as-is into the pipeline, as
  * the value of the environment variable with the given name.  A default value
  * can be optionally specified at create time. The default can be overridden
  * at run time using the inputs map. If no default is given, a value must be
  * supplied at runtime.  If `localCopy` is defined, then the parameter
  * specifies a data source or sink, both in Google Cloud Storage and on the
  * Docker container where the pipeline computation is run. The service account
  * associated with the Pipeline (by default the project&#39;s Compute Engine
  * service account) must have access to the Google Cloud Storage paths.  At
  * run time, the Google Cloud Storage paths can be overridden if a default was
  * provided at create time, or must be set otherwise. The pipeline runner
  * should add a key/value pair to either the inputs or outputs map. The
  * indicated data copies will be carried out before/after pipeline execution,
  * just as if the corresponding arguments were provided to `gsutil cp`.  For
  * example: Given the following `PipelineParameter`, specified in the
  * `inputParameters` list:  ``` {name: &quot;input_file&quot;, localCopy:
  * {path: &quot;file.txt&quot;, disk: &quot;pd1&quot;}} ```  where `disk` is
  * defined in the `PipelineResources` object as:  ``` {name: &quot;pd1&quot;,
  * mountPoint: &quot;/mnt/disk/&quot;} ```  We create a disk named `pd1`,
  * mount it on the host VM, and map `/mnt/pd1` to `/mnt/disk` in the docker
  * container.  At runtime, an entry for `input_file` would be required in the
  * inputs map, such as:  ```   inputs[&quot;input_file&quot;] =
  * &quot;gs://my-bucket/bar.txt&quot; ```  This would generate the following
  * gsutil call:  ```   gsutil cp gs://my-bucket/bar.txt /mnt/pd1/file.txt ```
  * The file `/mnt/pd1/file.txt` maps to `/mnt/disk/file.txt` in the Docker
  * container. Acceptable paths are:  &lt;table&gt;   &lt;thead&gt;
  * &lt;tr&gt;&lt;th&gt;Google Cloud storage path&lt;/th&gt;&lt;th&gt;Local
  * path&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;
  * &lt;tr&gt;&lt;td&gt;file&lt;/td&gt;&lt;td&gt;file&lt;/td&gt;&lt;/tr&gt;
  * &lt;tr&gt;&lt;td&gt;glob&lt;/td&gt;&lt;td&gt;directory&lt;/td&gt;&lt;/tr&gt;
  * &lt;/tbody&gt; &lt;/table&gt;  For outputs, the direction of the copy is
  * reversed:  ```   gsutil cp /mnt/disk/file.txt gs://my-bucket/bar.txt ```
  * Acceptable paths are:  &lt;table&gt;   &lt;thead&gt;
  * &lt;tr&gt;&lt;th&gt;Local path&lt;/th&gt;&lt;th&gt;Google Cloud Storage
  * path&lt;/th&gt;&lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;
  * &lt;tr&gt;&lt;td&gt;file&lt;/td&gt;&lt;td&gt;file&lt;/td&gt;&lt;/tr&gt;
  * &lt;tr&gt;       &lt;td&gt;file&lt;/td&gt;       &lt;td&gt;directory -
  * directory must already exist&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;
  * &lt;td&gt;glob&lt;/td&gt;       &lt;td&gt;directory - directory will be
  * created if it doesn&#39;t exist&lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt;
  * &lt;/table&gt;  One restriction due to docker limitations, is that for
  * outputs that are found on the boot disk, the local path cannot be a glob
  * and must be a file.
  */
@js.native
trait SchemaPipelineParameter extends StObject {
  
  /**
    * The default value for this parameter. Can be overridden at runtime. If
    * `localCopy` is present, then this must be a Google Cloud Storage path
    * beginning with `gs://`.
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * Human-readable description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If present, this parameter is marked for copying to and from the VM.
    * `LocalCopy` indicates where on the VM the file should be. The value given
    * to this parameter (either at runtime or using `defaultValue`) must be the
    * remote path where the file should be.
    */
  var localCopy: js.UndefOr[SchemaLocalCopy] = js.native
  
  /**
    * Required. Name of the parameter - the pipeline runner uses this string as
    * the key to the input and output maps in RunPipeline.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPipelineParameter {
  
  @scala.inline
  def apply(): SchemaPipelineParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineParameter]
  }
  
  @scala.inline
  implicit class SchemaPipelineParameterMutableBuilder[Self <: SchemaPipelineParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocalCopy(value: SchemaLocalCopy): Self = StObject.set(x, "localCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCopyUndefined: Self = StObject.set(x, "localCopy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
