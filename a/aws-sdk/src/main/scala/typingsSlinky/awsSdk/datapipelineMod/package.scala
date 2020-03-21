package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datapipelineMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.datapipelineMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EQ
    - typingsSlinky.awsSdk.awsSdkStrings.REF_EQ
    - typingsSlinky.awsSdk.awsSdkStrings.LE
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type OperatorType = typingsSlinky.awsSdk.datapipelineMod._OperatorType | java.lang.String
  type ParameterAttributeList = js.Array[typingsSlinky.awsSdk.datapipelineMod.ParameterAttribute]
  type ParameterObjectList = js.Array[typingsSlinky.awsSdk.datapipelineMod.ParameterObject]
  type ParameterValueList = js.Array[typingsSlinky.awsSdk.datapipelineMod.ParameterValue]
  type PipelineDescriptionList = js.Array[typingsSlinky.awsSdk.datapipelineMod.PipelineDescription]
  type PipelineObjectList = js.Array[typingsSlinky.awsSdk.datapipelineMod.PipelineObject]
  type PipelineObjectMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.datapipelineMod.PipelineObject]
  type SelectorList = js.Array[typingsSlinky.awsSdk.datapipelineMod.Selector]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FINISHED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type TaskStatus = typingsSlinky.awsSdk.datapipelineMod._TaskStatus | java.lang.String
  type ValidationErrors = js.Array[typingsSlinky.awsSdk.datapipelineMod.ValidationError]
  type ValidationWarnings = js.Array[typingsSlinky.awsSdk.datapipelineMod.ValidationWarning]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-10-29`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.datapipelineMod._apiVersion | java.lang.String
  type attributeNameString = java.lang.String
  type attributeValueString = java.lang.String
  type cancelActive = scala.Boolean
  type errorMessage = java.lang.String
  type fieldList = js.Array[typingsSlinky.awsSdk.datapipelineMod.Field]
  type fieldNameString = java.lang.String
  type fieldStringValue = java.lang.String
  type id = java.lang.String
  type idList = js.Array[typingsSlinky.awsSdk.datapipelineMod.id]
  type int = scala.Double
  type longString = java.lang.String
  type pipelineList = js.Array[typingsSlinky.awsSdk.datapipelineMod.PipelineIdName]
  type stringList = js.Array[java.lang.String]
  type tagKey = java.lang.String
  type tagList = js.Array[typingsSlinky.awsSdk.datapipelineMod.Tag]
  type tagValue = java.lang.String
  type taskId = java.lang.String
  type timestamp = js.Date
  type validationMessage = java.lang.String
  type validationMessages = js.Array[typingsSlinky.awsSdk.datapipelineMod.validationMessage]
}
