package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invocation extends js.Object {
  /**
    * The account that ran the analysis tool.
    */
  var account: js.UndefOr[String] = js.native
  /**
    * An array of strings, containing in order the command line arguments passed to the tool from the operating
    * system.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * The command line used to invoke the tool.
    */
  var commandLine: js.UndefOr[String] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run ended. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var endTimeUtc: js.UndefOr[String] = js.native
  /**
    * The environment variables associated with the analysis tool process, expressed as key/value pairs.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An absolute URI specifying the location of the analysis tool's executable.
    */
  var executableLocation: js.UndefOr[ArtifactLocation] = js.native
  /**
    * Specifies whether the tool's execution completed successfully.
    */
  var executionSuccessful: Boolean = js.native
  /**
    * The process exit code.
    */
  var exitCode: js.UndefOr[Double] = js.native
  /**
    * The reason for the process exit.
    */
  var exitCodeDescription: js.UndefOr[String] = js.native
  /**
    * The name of the signal that caused the process to exit.
    */
  var exitSignalName: js.UndefOr[String] = js.native
  /**
    * The numeric value of the signal that caused the process to exit.
    */
  var exitSignalNumber: js.UndefOr[Double] = js.native
  /**
    * The machine that hosted the analysis tool run.
    */
  var machine: js.UndefOr[String] = js.native
  /**
    * An array of configurationOverride objects that describe notifications related runtime overrides.
    */
  var notificationConfigurationOverrides: js.UndefOr[js.Array[ConfigurationOverride]] = js.native
  /**
    * The process id for the analysis tool run.
    */
  var processId: js.UndefOr[Double] = js.native
  /**
    * The reason given by the operating system that the process failed to start.
    */
  var processStartFailureMessage: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the invocation.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The locations of any response files specified on the tool's command line.
    */
  var responseFiles: js.UndefOr[js.Array[ArtifactLocation]] = js.native
  /**
    * An array of configurationOverride objects that describe rules related runtime overrides.
    */
  var ruleConfigurationOverrides: js.UndefOr[js.Array[ConfigurationOverride]] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the run started. See "Date/time properties" in the
    * SARIF spec for the required format.
    */
  var startTimeUtc: js.UndefOr[String] = js.native
  /**
    * A file containing the standard error stream from the process that was invoked.
    */
  var stderr: js.UndefOr[ArtifactLocation] = js.native
  /**
    * A file containing the standard input stream to the process that was invoked.
    */
  var stdin: js.UndefOr[ArtifactLocation] = js.native
  /**
    * A file containing the standard output stream from the process that was invoked.
    */
  var stdout: js.UndefOr[ArtifactLocation] = js.native
  /**
    * A file containing the interleaved standard output and standard error stream from the process that was invoked.
    */
  var stdoutStderr: js.UndefOr[ArtifactLocation] = js.native
  /**
    * A list of conditions detected by the tool that are relevant to the tool's configuration.
    */
  var toolConfigurationNotifications: js.UndefOr[js.Array[Notification]] = js.native
  /**
    * A list of runtime conditions detected by the tool during the analysis.
    */
  var toolExecutionNotifications: js.UndefOr[js.Array[Notification]] = js.native
  /**
    * The working directory for the analysis tool run.
    */
  var workingDirectory: js.UndefOr[ArtifactLocation] = js.native
}

object Invocation {
  @scala.inline
  def apply(executionSuccessful: Boolean): Invocation = {
    val __obj = js.Dynamic.literal(executionSuccessful = executionSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invocation]
  }
  @scala.inline
  implicit class InvocationOps[Self <: Invocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionSuccessful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionSuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withArguments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutableLocation(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutableLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(js.undefined)
        ret
    }
    @scala.inline
    def withExitCodeDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCodeDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCodeDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCodeDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withExitSignalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitSignalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitSignalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitSignalName")(js.undefined)
        ret
    }
    @scala.inline
    def withExitSignalNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitSignalNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitSignalNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitSignalNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withMachine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machine")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationConfigurationOverrides(value: js.Array[ConfigurationOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfigurationOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfigurationOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationConfigurationOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessStartFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStartFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessStartFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStartFailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFiles(value: js.Array[ArtifactLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleConfigurationOverrides(value: js.Array[ConfigurationOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleConfigurationOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleConfigurationOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleConfigurationOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withStderr(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
    @scala.inline
    def withStdoutStderr(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutStderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdoutStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdoutStderr")(js.undefined)
        ret
    }
    @scala.inline
    def withToolConfigurationNotifications(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolConfigurationNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolConfigurationNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolConfigurationNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withToolExecutionNotifications(value: js.Array[Notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecutionNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolExecutionNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecutionNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingDirectory(value: ArtifactLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(js.undefined)
        ret
    }
  }
  
}

