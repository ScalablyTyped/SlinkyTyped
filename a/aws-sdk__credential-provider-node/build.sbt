organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-e99935"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-9043c0",
  "org.scalablytyped.slinky" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-8b1e38",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-f2b0ba",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-d1f79d",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
