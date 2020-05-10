package typingsSlinky.gulpMsbuild.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
    // 4.0
  var architecture: js.UndefOr[String] = js.native
       // ['Rebuild']
  var configuration: js.UndefOr[String] = js.native
   // msbuild({ fileLoggerParameters: 'LogFile=Build.log;Append;Verbosity=diagnostic' })
  var consoleLoggerParameters: js.UndefOr[String] = js.native
   // msbuild({ loggerParameters: 'XMLLogger,./MyLogger.dll;OutputAsHTML' })
  var emitEndEvent: js.UndefOr[Boolean] = js.native
         // true
  var errorOnFail: js.UndefOr[Boolean] = js.native
         // false -> Show Startup Banner and Copyright Message
  var fileLoggerParameters: js.UndefOr[String] = js.native
    // false
  var logCommand: js.UndefOr[Boolean] = js.native
  var loggerParameters: js.UndefOr[String] = js.native
       // 'quiet', 'minimal', 'normal', 'detailed', 'diagnostic'
  var maxcpucount: js.UndefOr[Double] = js.native
     // Default: 0 = Automatic selection | Possible Values: -1 (MSBuild Default), 0 (Automatic), > 0 (Concrete value)
  var nodeReuse: js.UndefOr[Boolean] = js.native
      // true = Nodes remain after the build finishes so that subsequent builds can use them
  var nologo: js.UndefOr[Boolean] = js.native
    // 'x86' | 'x64'
  var properties: js.UndefOr[js.Any] = js.native
         // false
  var stderr: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
     // false
  var targets: js.UndefOr[js.Array[String]] = js.native
   // 'Release' | 'Debug'
  var toolsVersion: js.UndefOr[Double] = js.native
         // msbuild({ properties: { WarningLevel: 2 } })
  var verbosity: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withConsoleLoggerParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleLoggerParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleLoggerParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleLoggerParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitEndEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEndEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitEndEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitEndEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorOnFail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOnFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnFail")(js.undefined)
        ret
    }
    @scala.inline
    def withFileLoggerParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLoggerParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileLoggerParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLoggerParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withLogCommand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggerParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxcpucount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxcpucount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxcpucount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxcpucount")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeReuse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeReuse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeReuse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeReuse")(js.undefined)
        ret
    }
    @scala.inline
    def withNologo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nologo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNologo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nologo")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
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
    def withStderr(value: Boolean): Self = {
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
    def withStdout(value: Boolean): Self = {
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
    def withTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withToolsVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbosity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbosity")(js.undefined)
        ret
    }
  }
  
}

