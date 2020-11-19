package typingsSlinky.flightplan.FlightplanInterfaces

import typingsSlinky.flightplan.anon.Exec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  def awk(command: String): CommandResult = js.native
  def awk(command: String, options: CommandOptions): CommandResult = js.native
  def awk(command: String, options: Exec): CommandResult = js.native
  
  def cat(command: String): CommandResult = js.native
  def cat(command: String, options: CommandOptions): CommandResult = js.native
  def cat(command: String, options: Exec): CommandResult = js.native
  
  def cd(command: String): CommandResult = js.native
  def cd(command: String, options: CommandOptions): CommandResult = js.native
  def cd(command: String, options: Exec): CommandResult = js.native
  
  def chgrp(command: String): CommandResult = js.native
  def chgrp(command: String, options: CommandOptions): CommandResult = js.native
  def chgrp(command: String, options: Exec): CommandResult = js.native
  
  def chmod(command: String): CommandResult = js.native
  def chmod(command: String, options: CommandOptions): CommandResult = js.native
  def chmod(command: String, options: Exec): CommandResult = js.native
  
  def chown(command: String): CommandResult = js.native
  def chown(command: String, options: CommandOptions): CommandResult = js.native
  def chown(command: String, options: Exec): CommandResult = js.native
  
  def cp(command: String): CommandResult = js.native
  def cp(command: String, options: CommandOptions): CommandResult = js.native
  def cp(command: String, options: Exec): CommandResult = js.native
  
  def debug(message: String): Unit = js.native
  
  def echo(command: String): CommandResult = js.native
  def echo(command: String, options: CommandOptions): CommandResult = js.native
  def echo(command: String, options: Exec): CommandResult = js.native
  
  def exec(command: String): CommandResult = js.native
  def exec(command: String, options: CommandOptions): CommandResult = js.native
  def exec(command: String, options: Exec): CommandResult = js.native
  
  def failsafe(): Unit = js.native
  
  def find(command: String): CommandResult = js.native
  def find(command: String, options: CommandOptions): CommandResult = js.native
  def find(command: String, options: Exec): CommandResult = js.native
  
  def ftp(command: String): CommandResult = js.native
  def ftp(command: String, options: CommandOptions): CommandResult = js.native
  def ftp(command: String, options: Exec): CommandResult = js.native
  
  def git(command: String): CommandResult = js.native
  def git(command: String, options: CommandOptions): CommandResult = js.native
  def git(command: String, options: Exec): CommandResult = js.native
  
  def grep(command: String): CommandResult = js.native
  def grep(command: String, options: CommandOptions): CommandResult = js.native
  def grep(command: String, options: Exec): CommandResult = js.native
  
  def groups(command: String): CommandResult = js.native
  def groups(command: String, options: CommandOptions): CommandResult = js.native
  def groups(command: String, options: Exec): CommandResult = js.native
  
  def hg(command: String): CommandResult = js.native
  def hg(command: String, options: CommandOptions): CommandResult = js.native
  def hg(command: String, options: Exec): CommandResult = js.native
  
  def hostname(command: String): CommandResult = js.native
  def hostname(command: String, options: CommandOptions): CommandResult = js.native
  def hostname(command: String, options: Exec): CommandResult = js.native
  
  def kill(command: String): CommandResult = js.native
  def kill(command: String, options: CommandOptions): CommandResult = js.native
  def kill(command: String, options: Exec): CommandResult = js.native
  
  def ln(command: String): CommandResult = js.native
  def ln(command: String, options: CommandOptions): CommandResult = js.native
  def ln(command: String, options: Exec): CommandResult = js.native
  
  def log(message: String): Unit = js.native
  
  def ls(command: String): CommandResult = js.native
  def ls(command: String, options: CommandOptions): CommandResult = js.native
  def ls(command: String, options: Exec): CommandResult = js.native
  
  def mkdir(command: String): CommandResult = js.native
  def mkdir(command: String, options: CommandOptions): CommandResult = js.native
  def mkdir(command: String, options: Exec): CommandResult = js.native
  
  def mv(command: String): CommandResult = js.native
  def mv(command: String, options: CommandOptions): CommandResult = js.native
  def mv(command: String, options: Exec): CommandResult = js.native
  
  def node(command: String): CommandResult = js.native
  def node(command: String, options: CommandOptions): CommandResult = js.native
  def node(command: String, options: Exec): CommandResult = js.native
  
  def npm(command: String): CommandResult = js.native
  def npm(command: String, options: CommandOptions): CommandResult = js.native
  def npm(command: String, options: Exec): CommandResult = js.native
  
  def prompt(message: String): String = js.native
  def prompt(message: String, options: PromptOptions): String = js.native
  
  def ps(command: String): CommandResult = js.native
  def ps(command: String, options: CommandOptions): CommandResult = js.native
  def ps(command: String, options: Exec): CommandResult = js.native
  
  def pwd(command: String): CommandResult = js.native
  def pwd(command: String, options: CommandOptions): CommandResult = js.native
  def pwd(command: String, options: Exec): CommandResult = js.native
  
  def rm(command: String): CommandResult = js.native
  def rm(command: String, options: CommandOptions): CommandResult = js.native
  def rm(command: String, options: Exec): CommandResult = js.native
  
  def rmdir(command: String): CommandResult = js.native
  def rmdir(command: String, options: CommandOptions): CommandResult = js.native
  def rmdir(command: String, options: Exec): CommandResult = js.native
  
  def rsync(command: String): CommandResult = js.native
  def rsync(command: String, options: CommandOptions): CommandResult = js.native
  def rsync(command: String, options: Exec): CommandResult = js.native
  
  var runtime: Host = js.native
  
  def scp(command: String): CommandResult = js.native
  def scp(command: String, options: CommandOptions): CommandResult = js.native
  def scp(command: String, options: Exec): CommandResult = js.native
  
  def sed(command: String): CommandResult = js.native
  def sed(command: String, options: CommandOptions): CommandResult = js.native
  def sed(command: String, options: Exec): CommandResult = js.native
  
  def silent(): Unit = js.native
  
  def sudo(command: String): CommandResult = js.native
  def sudo(command: String, options: SudoOptions): CommandResult = js.native
  
  def svn(command: String): CommandResult = js.native
  def svn(command: String, options: CommandOptions): CommandResult = js.native
  def svn(command: String, options: Exec): CommandResult = js.native
  
  def tail(command: String): CommandResult = js.native
  def tail(command: String, options: CommandOptions): CommandResult = js.native
  def tail(command: String, options: Exec): CommandResult = js.native
  
  def tar(command: String): CommandResult = js.native
  def tar(command: String, options: CommandOptions): CommandResult = js.native
  def tar(command: String, options: Exec): CommandResult = js.native
  
  def touch(command: String): CommandResult = js.native
  def touch(command: String, options: CommandOptions): CommandResult = js.native
  def touch(command: String, options: Exec): CommandResult = js.native
  
  def transfer(files: js.Array[CommandResult | String], remoteDir: String): js.Array[CommandResult] = js.native
  def transfer(files: js.Array[CommandResult | String], remoteDir: String, options: CommandOptions): js.Array[CommandResult] = js.native
  def transfer(files: CommandResult, remoteDir: String): js.Array[CommandResult] = js.native
  def transfer(files: CommandResult, remoteDir: String, options: CommandOptions): js.Array[CommandResult] = js.native
  
  def unzip(command: String): CommandResult = js.native
  def unzip(command: String, options: CommandOptions): CommandResult = js.native
  def unzip(command: String, options: Exec): CommandResult = js.native
  
  def verbose(): Unit = js.native
  
  def waitFor(fn: js.Function1[/* done */ js.Function1[/* result */ js.Any, Unit], Unit]): js.Any = js.native
  
  def whoami(command: String): CommandResult = js.native
  def whoami(command: String, options: CommandOptions): CommandResult = js.native
  def whoami(command: String, options: Exec): CommandResult = js.native
  
  def `with`(command: String, fn: js.Function0[Unit]): Unit = js.native
  def `with`(command: String, options: CommandOptions, fn: js.Function0[Unit]): Unit = js.native
  def `with`(options: CommandOptions, fn: js.Function0[Unit]): Unit = js.native
  
  def zip(command: String): CommandResult = js.native
  def zip(command: String, options: CommandOptions): CommandResult = js.native
  def zip(command: String, options: Exec): CommandResult = js.native
}
