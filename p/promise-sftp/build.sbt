organization := "org.scalablytyped.slinky"
name := "promise-sftp"
version := "1.3-dt-20190819Z-3ed2b3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20191111Z-d516b0",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "promise-ftp-common" % "1.1-dt-20180709Z-4bd9ed",
  "org.scalablytyped.slinky" %%% "ssh2" % "v0.5.x-dt-20190903Z-6ea7d0",
  "org.scalablytyped.slinky" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-f9f7df",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        