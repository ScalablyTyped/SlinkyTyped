package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDataConfig extends js.Object {
  
  /**
    * Describes the format of the data that you submit to Amazon Translate as input. You can specify one of the following multipurpose internet mail extension (MIME) types:    text/html: The input data consists of one or more HTML files. Amazon Translate translates only the text that resides in the html element in each file.    text/plain: The input data consists of one or more unformatted text files. Amazon Translate translates every character in this type of input.    application/vnd.openxmlformats-officedocument.wordprocessingml.document: The input data consists of one or more Word documents (.docx).    application/vnd.openxmlformats-officedocument.presentationml.presentation: The input data consists of one or more PowerPoint Presentation files (.pptx).    application/vnd.openxmlformats-officedocument.spreadsheetml.sheet: The input data consists of one or more Excel Workbook files (.xlsx).    If you structure your input data as HTML, ensure that you set this parameter to text/html. By doing so, you cut costs by limiting the translation to the contents of the html element in each file. Otherwise, if you set this parameter to text/plain, your costs will cover the translation of every character. 
    */
  var ContentType: typingsSlinky.awsSdk.translateMod.ContentType = js.native
  
  /**
    * The URI of the AWS S3 folder that contains the input file. The folder must be in the same Region as the API endpoint you are calling.
    */
  var S3Uri: typingsSlinky.awsSdk.translateMod.S3Uri = js.native
}
object InputDataConfig {
  
  @scala.inline
  def apply(ContentType: ContentType, S3Uri: S3Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit class InputDataConfigOps[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
  }
}
