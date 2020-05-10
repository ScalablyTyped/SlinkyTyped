package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * A section of the request body that provides information about the file that is being transcoded.
    */
  var Input: js.UndefOr[JobInput] = js.native
  /**
    * A section of the request body that provides information about the files that are being transcoded.
    */
  var Inputs: js.UndefOr[JobInputs] = js.native
  /**
    *  A section of the request body that provides information about the transcoded (target) file. We strongly recommend that you use the Outputs syntax instead of the Output syntax. 
    */
  var Output: js.UndefOr[CreateJobOutput] = js.native
  /**
    * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates, including output files, thumbnails, and playlists.
    */
  var OutputKeyPrefix: js.UndefOr[Key] = js.native
  /**
    *  A section of the request body that provides information about the transcoded (target) files. We recommend that you use the Outputs syntax instead of the Output syntax. 
    */
  var Outputs: js.UndefOr[CreateJobOutputs] = js.native
  /**
    * The Id of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to transcode and the bucket into which Elastic Transcoder puts the transcoded files.
    */
  var PipelineId: Id = js.native
  /**
    * If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. The maximum number of master playlists in a job is 30.
    */
  var Playlists: js.UndefOr[CreateJobPlaylists] = js.native
  /**
    * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in key/value pairs, and you can add up to 10 key/value pairs per job. Elastic Transcoder does not guarantee that key/value pairs are returned in the same order in which you specify them.
    */
  var UserMetadata: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.UserMetadata] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(PipelineId: Id): CreateJobRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: JobInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: JobInputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: CreateJobOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputKeyPrefix(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputKeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputKeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: CreateJobOutputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylists(value: CreateJobPlaylists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Playlists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Playlists")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMetadata(value: UserMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(js.undefined)
        ret
    }
  }
  
}

