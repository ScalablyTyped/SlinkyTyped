organization := "org.scalablytyped.slinky"
name := "promise-sftp"
version := "1.3-dt-20200515Z-94464f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20201028Z-a72283",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "promise-ftp-common" % "1.1-dt-20180709Z-4f6b70",
  "org.scalablytyped.slinky" %%% "ssh2" % "v0.5.x-dt-20201027Z-67514c",
  "org.scalablytyped.slinky" %%% "ssh2-streams" % "v0.1.9-dt-20201002Z-87823c",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
