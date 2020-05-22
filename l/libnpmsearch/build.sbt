organization := "org.scalablytyped.slinky"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-53d66c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-cb3aa6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200515Z-533341",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20200515Z-cd685a",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-167691",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-fb5b7d",
  "org.scalablytyped.slinky" %%% "ssri" % "6.0-dt-20200515Z-1fb3ec",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
